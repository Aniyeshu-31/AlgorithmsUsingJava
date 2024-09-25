package com.company;
import java.util.Base64;
import java.util.Random;

public class TripleDES {
    // Initial Permutation Table
    private static final int[] INITIAL_PERMUTATION = {
            58, 50, 42, 34, 26, 18, 10, 2,
            60, 52, 44, 36, 28, 20, 12, 4,
            62, 54, 46, 38, 30, 22, 14, 6,
            64, 56, 48, 40, 32, 24, 16, 8,
            57, 49, 41, 33, 25, 17, 9, 1,
            59, 51, 43, 35, 27, 19, 11, 3,
            61, 53, 45, 37, 29, 21, 13, 5,
            63, 55, 47, 39, 31, 23, 15, 7
    };

    // Final Permutation Table
    private static final int[] FINAL_PERMUTATION = {
            40, 8, 48, 16, 56, 24, 64, 32,
            39, 7, 47, 15, 55, 23, 63, 31,
            38, 6, 46, 14, 54, 22, 62, 30,
            37, 5, 45, 13, 53, 21, 61, 29,
            36, 4, 44, 12, 52, 20, 60, 28,
            35, 3, 43, 11, 51, 19, 59, 27,
            34, 2, 42, 10, 50, 18, 58, 26,
            33, 1, 41, 9, 49, 17, 57, 25
    };

    // Key generation for 56-bit keys
    private static long[] generateKeys() {
        Random random = new Random();
        long[] keys = new long[3];
        for (int i = 0; i < 3; i++) {
            keys[i] = random.nextLong() & 0xFFFFFFF000000000L; // 56-bit key
        }
        return keys;
    }

    // Initial and Final Permutations
    private static long permute(long data, int[] permutationTable) {
        long result = 0;
        for (int i = 0; i < permutationTable.length; i++) {
            result |= ((data >> (64 - permutationTable[i])) & 1L) << (64 - i - 1);
        }
        return result;
    }

    // Simplified DES function
    private static long des(long data, long[] keys) {
        for (long key : keys) {
            data = data ^ key;
            data = permute(data, INITIAL_PERMUTATION);
            long left = data >>> 32;
            long right = data & 0xFFFFFFFFL;
            data = (right << 32) | left;
            data = permute(data, FINAL_PERMUTATION);
        }
        return data;
    }

    // Encrypt plaintext
    private static String encrypt(String plaintext, long[] keys) {
        StringBuilder ciphertext = new StringBuilder();
        for (char block : plaintext.toCharArray()) {
            long blockBits = (long) block;
            long encryptedBlock = des(blockBits, keys);
            byte[] encryptedBytes = longToBytes(encryptedBlock);
            String base64Encoded = Base64.getEncoder().encodeToString(encryptedBytes);
            ciphertext.append(base64Encoded);
        }
        return ciphertext.toString();
    }

    // Decrypt ciphertext
    private static String decrypt(String ciphertext, long[] keys) {
        StringBuilder plaintext = new StringBuilder();
        for (int i = 0; i < ciphertext.length(); i += 12) {
            String blockBase64 = ciphertext.substring(i, i + 12);
            byte[] encryptedBytes = Base64.getDecoder().decode(blockBase64);
            long encryptedBlock = bytesToLong(encryptedBytes);
            long decryptedBlock = des(encryptedBlock, keys);
            plaintext.append((char) decryptedBlock);
        }
        return plaintext.toString();
    }

    // Helper function to convert a long to a byte array
    private static byte[] longToBytes(long value) {
        byte[] result = new byte[8];
        for (int i = 7; i >= 0; i--) {
            result[i] = (byte) (value & 0xFF);
            value >>= 8;
        }
        return result;
    }

    // Helper function to convert a byte array to a long
    private static long bytesToLong(byte[] bytes) {
        long value = 0;
        for (byte b : bytes) {
            value = (value << 8) | (b & 0xFF);
        }
        return value;
    }

    public static void main(String[] args) {
        String plaintext = "My name is Aniyeshu Verma. Mr. Santosh Kumar Verma is my father. I live in Lucknow. My phone number is 639465232. Currently," +
                " I am doing B.Tech from IIIT Vadodara Gandhinagar. Mr. Aryan Srivastava and Mr. Archit Raj are my best friends." +
                " I like living in Lucknow and my dream company is Oracle.";

        long[] keys = generateKeys();

        System.out.println("Original Plaintext: " + plaintext);

        // Printing Keys in hexadecimal format
        System.out.println("Generated Keys(in Hexadecimal format):");
        System.out.println("K1: " + String.format("%016X", keys[0]));
        System.out.println("K2: " + String.format("%016X", keys[1]));
        System.out.println("K3: " + String.format("%016X", keys[2]));

        String encryptedText = encrypt(plaintext, keys);
        System.out.println("Encrypted Text(in hexadecimal format): " + encryptedText);

        String decryptedText = decrypt(encryptedText, keys);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}

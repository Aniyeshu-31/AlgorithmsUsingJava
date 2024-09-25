package com.company;
import java.util.Random;
import java.util.*;
public class RC5 {
    public static void main(String[] args) {
        // Task 1: Take a 32-bit Plain Text P and select a 52-bit RANDOM key K
        String plaintext = generate_random_string(32); // 32 bits for plaintext
        String key = generate_random_string(52); // 52 bits for key
        // Task 2: Generate Cipher Text C ← E(K, P) (16 rounds encryption)
        String ciphertext16Rounds = encryption(plaintext, key, 16);
        // Task 3: Generate Cipher Text C1 ← E(K, P) (32 rounds encryption)
        String ciphertext32Rounds = encryption(plaintext, key, 32);
        // Task 4: Analyze the avalanche effect by comparing C1 and C2 using P
        int differences1 = find_diff_between_to_string(plaintext, ciphertext16Rounds);
        int differences2 = find_diff_between_to_string(plaintext, ciphertext32Rounds);
        System.out.println("plaintext: " + plaintext);
        System.out.println("Ciphertext after 16 rounds: " + ciphertext16Rounds);
        System.out.println("Ciphertext after 32 rounds: " + ciphertext32Rounds);
        System.out.println("Number of bit diff between ciphertexts C1 and plaintext: " + differences1);
        System.out.println("Number of bit diff between ciphertexts C2 and plaintext: " + differences2);
    }

    // RC5 Encryption Function (Basic Example)
    static String encryption(String plaintext, String key, int rounds) {         int w = 32; // Word size (32 bits)
        int r = rounds; // Number of rounds

        int[] S = new int[2 * (r + 1)]; // RC5 state variables
        int[] L = new int[1]; // Integer representation of plaintext (32 bits)
        int[] K = new int[key.length() / w]; // Integer representation of key
        // Convert plaintext and key to integers
        L[0] = string_to_int(plaintext);
        for (int i = 0; i < K.length; i++) {

        K[i] = string_to_int(key.substring(i * w, (i + 1) * w));         }

    // Key expansion
        for(int i = 0; i < S.length; i++) {
        S[i] = 0;
    }
    int P = 0xb7e15163; // Magic constant

        for (int i = 1; i <= 3 * Math.max(S.length, K.length); i++) {
        S[i % S.length] = S[i % S.length] ^ (S[(i - 1) % S.length] ^ S[(i - 1)
                % S.length] << 2) + (P ^ (i - 1));
    }

    // Encryption
        int A = L[0];         int B = 0;         A = A + S[0];         B = B + S[1];
        for (int round = 1; round <= r; round++) {
        A	= ((A ^ B) << (B & 0x1F)) + S[2 * round];
        B	= ((B ^ A) << (A & 0x1F)) + S[2 * round + 1];
    }

    L[0] = A;

    // Convert back to binary string
    String ciphertext = int_to_binary(L[0], w);         return ciphertext;
}      static int string_to_int(String binary_string) {         return Integer.parseUnsignedInt(binary_string, 2);     }      static String int_to_binary(int value, int length) {         String binary_string = Integer.toBinaryString(value);         while (binary_string.length() < length) {             binary_string = "0" + binary_string;
}
    return binary_string;
}
    static String generate_random_string(int length) {
        StringBuilder ans = new StringBuilder();         Random RANDOM = new Random();         for (int i = 0; i < length; i++) {             ans.append(RANDOM.nextInt(2));
        }
        return ans.toString();     }

// Function to count the number of bit diff between two strings
     static int find_diff_between_to_string(String str1, String str2) {         int diff = 0;
        for (int i = 0; i < str1.length(); i++) {             if (str1.charAt(i) != str2.charAt(i)) {
            diff++;
        }
        }
        return diff;
        }
        }


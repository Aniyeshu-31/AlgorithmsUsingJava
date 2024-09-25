package com.company;


import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String word1, word2;
        int l1 = 0, l2 = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 words");
        word1 = sc.next().toUpperCase();
        word2 = sc.next().toUpperCase();
        l1 = word1.length();
        l2 = word2.length();
        boolean isAnagram;
        isAnagram = true;
        if (l1 != l2) {
            System.out.println("NOT AN ANAGRAM WORD");
        } else {
            int al[] = new int[256];
            int bl[] = new int[256];
            for (char c : word1.toCharArray()) {
                int index = (int) c;
                al[index]++;
            }
            for (char c1 : word2.toCharArray()) {
                int index1 = (int) c1;
                bl[index1]++;
            }
            for (i = 0; i < 256; i++) {
                if (al[i] != bl[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) {
                System.out.println("anagram");
            } else {
                System.out.println("Not anagram");
            }
        }
    }
}



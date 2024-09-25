package com.company;

import java.util.Scanner;

public class wordPalindrome {
    public static void main(String args[]) {
        String s, w = " ";
        int l = 0, i = 0;
        char ch = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("input a word");
        s = sc.next().toUpperCase();
        s = s.trim();
        l = s.length();
        for (i = 0; i <= l - 1; i++) {
            ch = s.charAt(i);
            w = ch + w;

        }
          w=w.trim();
        if (w.equals(s))
        {
            System.out.println(w +" "+"is palindrome");
        }
        else
        {
            System.out.println(w +" "+"is not palindrome");
        }


    }
}



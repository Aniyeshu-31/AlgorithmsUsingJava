package com.company;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        String s;
        String w = "";
        int i = 0, l = 0, c = 0;
        char ch = ' ', ch1 = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("input the word");
        s = sc.next();
        l = s.length();

        for (i = 0; i < l - 1; i++) {
            ch = s.charAt(i);
            ch1 = s.charAt(i + 1);
            if (ch == ch1) {
                c++;
            } else {
                w = w + ch;
            }
            if (i == l - 2) {
                w = w + ch1;
            }
        }


        System.out.println(w);


    }
}




package com.company;

import java.util.Scanner;

public class invertpattern {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, l = 0;
        String S = "ABCDE";
        Scanner sc = new Scanner(System.in);
        System.out.println("input the limit");
        l = S.length();
//        n=sc.nextInt();
        for (i = 0; i <= l-1; i++) {
            for (j =i; j<=l-1; j++) {
                System.out.print(S.charAt(j));
            }
            System.out.println();
        }
    }
}


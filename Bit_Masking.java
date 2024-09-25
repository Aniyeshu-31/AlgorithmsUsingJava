package com.company;

import java.util.Scanner;

public class Bit_Masking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, c = 0;
        a = n;
        while (a != 0) {
            if ((a & 1) == 1) {
                c++;

            }
            a = a >> 1;

        }

        System.out.println(c);

    }
}

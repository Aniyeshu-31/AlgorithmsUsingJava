package com.company;
import java.util.*;
public class newpattern4 {
    public static void main(String args[]) {
        int n, i = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        n = sc.nextInt();
        System.out.println("*");
        for (i = 2; i <= n - 1; i++) {
            System.out.print("*");
            for (j = 1; j <= (i - 2); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

            for (i = 1; i <= n; i++)
            {
                System.out.print("*");
            }
        }
    }



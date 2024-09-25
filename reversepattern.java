package com.company;

import java.util.Scanner;

public class reversepattern {
    public static void main(String[] args) {
        int n, i = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the limit");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--)
            {
                if (k == n || k == i || i==1)
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}




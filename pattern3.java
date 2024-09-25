package com.company;
import java.util.*;
public class pattern3 {
    public static void main(String args[]) {
        int i = 0, j = 0, n, k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the limit");
        n = sc.nextInt();
        int rows = (2 * n - 1);
        for (i = 1; i <= (2 * n - 1); i++) {
            if (i <= n) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (k = 1; k <= (rows-i+1); k++)
                {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}








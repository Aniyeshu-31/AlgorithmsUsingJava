package com.company;
import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        int n, i = 0, j = 0, k = 0, l = 0, h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the limit");
        n = sc.nextInt();
        int rows = 2 * n - 1;
        for (i = 1; i <= rows; i++) {
            if (i <= n) {
                for (j = 1; j <= 2 * (n - i); j++) {
                    System.out.print(" ");
                }
                for (k = 1; k <= i; k++) {
                    if (k==1 || k==i) {
                        System.out.print("*   ");
                    }
                    else
                    {
                        System.out.print("    ");
                    }
                }
                System.out.println();

            } else {
                for (l = 1; l <= 2 * (i - n); l++) {
                    System.out.print(" ");
                }
                for (h = 1; h <= (rows - i + 1); h++) {
                    if (h==1 || h==(rows - i + 1)) {
                        System.out.print("*   ");
                    }
                    else
                    {
                        System.out.print("    ");
                    }
                }
                System.out.println();
            }
        }
    }
}

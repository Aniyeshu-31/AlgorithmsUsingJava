package com.company;

import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        int a[][], b[][], i = 0, j = 0;
        int n;
        int m;
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size");
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        b = new int[n][m];
        int res[][] = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                res[i][j] = 0;
                for (k = 0; k < n; k++)
                    res[i][j] += a[i][k]
                            * b[k][j];
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                System.out.print(res[i][j]
                        + " ");
            System.out.println();
        }
    }
}

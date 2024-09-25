package com.company;
import java.util.*;
public class series_1 {
    public static void main(String[] args) {
        int a[], b[], n, i = 0, j = 0, q = 0, sum = 0, k = 0;
        Scanner sc = new Scanner(System.in);
        q = sc.nextInt();
        int w[];
        w = new int[q];
        a = new int[q];
        b = new int[q];
        for (i = 0; i < q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
            for (i = 0; i < q; i++) {
                for (j = 0; j <= w[i]; j++) {

                    sum = sum + (a[i] + (int) Math.pow(2, j) * b[i]);
                    System.out.print(sum + " ");

                }
                System.out.println();

            }
        }
    }




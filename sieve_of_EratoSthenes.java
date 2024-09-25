package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class sieve_of_EratoSthenes {
    public static void main(String[] args) {
        int n;
        int i = 0, j = 0, k = 0;
        boolean t[];
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        n = sc.nextInt();
        t = new boolean[n+1];
        Arrays.fill(t, true);
        t[0] = false;
        t[1] = false;
        for (i = 2; i <= (int) Math.sqrt(n); i++)
        {
            for (j = 2 * i; j <= n; j = j + i)
            {
                t[j] = false;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(i+" "+t[i]);
        }
    }
}

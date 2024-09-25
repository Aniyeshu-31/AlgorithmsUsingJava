package com.company;

import java.util.Scanner;

public class peterson {
    public static void main(String[] args) {
        int n, d = 0, sum = 0;
        int i = 0, f = 0, cpy = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number");
        n = sc.nextInt();
        cpy = n;
        while (n != 0)
        {
            f=1;
            d = n % 10;
            for (i = d; i >= 1; i--)
            {
                f = f * i;
            }
            sum = sum + f;
            n = n / 10;
        }
        if(sum==cpy)
            System.out.println("YES");
        else
            System.out.println("NO");

        }
    }

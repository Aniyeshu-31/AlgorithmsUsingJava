package com.company;

import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String[] args) {
        int n, i = 0, j = 0, k = 0,c=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the limit");
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= (n - i); j++)
            {
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++)
            {
                if (k == 1 || k == i)
                {

                    System.out.print(1+"  ");
                }
                else
                {
                    c=c*(i-k+1)/k;
                    System.out.print(c+"  ");

                }


            }
            System.out.println();


        }
    }
}


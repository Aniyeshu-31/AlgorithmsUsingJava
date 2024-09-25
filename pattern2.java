package com.company;
import java.util.*;
public class pattern2 {
    public static void main(String args[]) {
        int i = 0, j = 0,k=0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the limit");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
        for (j= 1; j<= (n - i); j++)
        {
            System.out.print("  ");
        }
                for (k = 1; k <= i; k++)
                {
                    System.out.print("* ");

                }
                System.out.println();
            }

        }
    }



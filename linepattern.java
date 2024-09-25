package com.company;

import java.util.Scanner;

public class linepattern {
    public static void main(String[] args) {
        int i=0,j=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the limit");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                if(j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

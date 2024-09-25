package com.company;

import java.util.Scanner;

public class right {
    public static void main(String[] args) {
        int i=0,j=0;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

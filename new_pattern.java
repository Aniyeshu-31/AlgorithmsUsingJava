package com.company;

import java.util.Scanner;

public class new_pattern {
    public static void main(String[] args) {
        int n=5,v=0;
        int i=0,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input n");
//        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=1;j<=(2*(n-i));j++)
            {
                System.out.print(" ");
            }
            for(k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}

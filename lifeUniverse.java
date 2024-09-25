package com.company;

import java.util.Scanner;

public class lifeUniverse {
    public static void main(String[] args) {
         int n,i=0,c=0;
         n=0;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         int a[];
         a=new int[n];
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         for(i=0;i<n;i++)
         {
             if(a[i]!=42)
             {
                 c++;
             }
             else
             {
                 for(i=0;i<c;i++)
                 {
                     System.out.println(a[i]);
                 }
             }
         }

    }
}

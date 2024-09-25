package com.company;
import java.util.*;
public class array {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        int a[] = new int[n];

        int i = 0;
        for (i = 0; i <=n-1; i++) {
            a[i] = sc.nextInt();
        }
       int m=a[0];
        for(i=1;i<=n-1;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }

        }
        System.out.println("largest element "+m);
        }
    }
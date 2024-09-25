package com.company;

import java.util.*;

public class bsort {
    public static void main(String[] args) {
        int a[];
        int i=0,j=0;
        Random r=new Random(100);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        a=new int[n];
        long start=System.nanoTime();
        for(i=0;i<n;i++)
        {
            a[i]=(r.nextInt(900))+100;
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
        long end=System.nanoTime();
        long elapsedtime= end-start;
        System.out.println();
        System.out.print(elapsedtime);
    }
    }


package com.company;
import java.util.*;
public class array1 {
    public static void main(String args[])
    {
        int i=0,j=0,pos=0,temp=0,n=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("input the size");
         n=sc.nextInt();
         int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        pos=n-1;
        temp=a[pos];
         for(i=pos;i>0;i--)
         {
             a[i]=a[i-1];
         }
         a[0]=temp;
         for(i=0;i<=n-1;i++)
         {
             System.out.println(a[i]);
         }

    }
}

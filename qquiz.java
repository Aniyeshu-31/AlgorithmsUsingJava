package com.company;
import java.util.*;
public class qquiz {
    public static void main(String args[])
    {
        int n,i=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        //printing using for-each loop
        for(int s:a)
        {
            System.out.println(s);
        }
    }
}

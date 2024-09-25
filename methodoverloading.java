package com.company;
import java.util.*;
public class methodoverloading {
    static int calc(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    static int calc(int a,int b,int c)
    {
        int p=a*b*c;
        return p;
    }
    static float calc(float a,float b,float c)
    {
        float div=(a*b)/c;
        return div;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int h=sc.nextInt();
        float v=sc.nextFloat();
        float s=sc.nextFloat();
        float x=sc.nextFloat();
      System.out.println(calc(k,l));
       System.out.println( calc(m,n,h));
        System.out.println(calc(v,s,x));
    }
}
//JAVA IS ALWAYS "PASS BY VALUE"
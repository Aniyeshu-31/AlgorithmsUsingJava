package com.company;
import java.util.*;
public class methods_1 {
   static int max(int a ,int b)
    {
       if(a>b)
           return a;
       else
           return b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k,m;
        k=sc.nextInt();
        m=sc.nextInt();
       System.out.println( max(k,m));
    }





}

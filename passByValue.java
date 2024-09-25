package com.company;
import java.util.*;
public class passByValue {
    static void add(int b,int c)
    {
        b=90;
        c=90;
        int sum=0;
        sum=b+c;
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=23;
        int m=30;
       add(k,m);
      System.out.println(k+" "+m);

    }
}

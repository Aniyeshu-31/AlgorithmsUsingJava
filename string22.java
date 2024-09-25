package com.company;
import java.util.*;
public class string22 {
    public static void main(String[] args)
    {
        int i=0,j=0,l=0;
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the word");
        s=sc.next().toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            for(j=0;j<=(l-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(s.charAt(k)+" ");
            }
            System.out.println();
        }


    }
}

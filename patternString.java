package com.company;
import java.util.*;
public class patternString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.next().toUpperCase();
        int i=0,l=s.length(),j=0;

        for(i=0;i<=l-1;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}

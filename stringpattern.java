package com.company;

import java.util.Scanner;

public class stringpattern {
    public static void main(String[] args) {
        String s=" ";
        int i=0,j=0,l=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the string");
        s=sc.next().toUpperCase();
        l=s.length();
        for(i=0;i<l;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}

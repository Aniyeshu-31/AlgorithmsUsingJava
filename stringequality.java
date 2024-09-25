package com.company;

import java.util.Scanner;

public class stringequality {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        if(s1.equals(s2))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}

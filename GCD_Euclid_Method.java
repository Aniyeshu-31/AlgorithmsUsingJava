package com.company;

import java.util.Scanner;
public class GCD_Euclid_Method {
    static int gcd(int a, int b)
    {
        if(a%b==0)
            return b;
        else if(b==0)
        return a;
        else
            return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("input two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
}

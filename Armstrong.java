package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,d=0,r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number");
        n=sc.nextInt();
        int cpy=n;
        while(n!=0)
        {
            d=n%10;
            r=r+(d*d*d);
            n=n/10;
        }
        if(cpy==r) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");


    }
}

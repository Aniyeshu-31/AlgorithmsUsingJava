package com.company;
import java.util.*;
public class palindrom {
    public static void main(String args[])
    {
        int n,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input a number");
        n=sc.nextInt();
        int cpy=n;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(cpy==rev)
            System.out.println("it is a palindrome number");
        else
            System.out.println("it is not a palindrome number");

    }
}

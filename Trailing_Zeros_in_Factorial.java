package com.company;
import java.util.*;
public class Trailing_Zeros_in_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,res=0;
        System.out.println("input a number");
        n=sc.nextInt();
        for(int i=5;i<=n;i=i*5)
        {
            res=res+(n/i);
        }
        System.out.println(res);
    }
}

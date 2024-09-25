package com.company;
import java.util.*;
public class r {
    public static void main(String[] args) {
        int n, rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input a  number");
        n=sc.nextInt();
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("The reverse of a number is:"+rev);
    }
}

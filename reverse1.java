package com.company;

public class reverse1 {
    public static void main(String[] args) {
        int n=899;int rev=0;
        for(int i=n;i!=0;i=i/10)
        {
            int d=i%10;
            rev=rev*10+d;
        }
        System.out.println(rev);
        if(n<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("positive");
        }
        if(n%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}

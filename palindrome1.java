package com.company;
import java.util.*;
public class palindrome1 {
    static long isSumPalindrome(long n){
        long rev=0,sum=0,rev1=0;
        long cpy=n;
        while(n!=0)
        {
            long d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        sum=cpy+rev;
        long cpy1=sum;
        while(sum!=0)
        {
            long j=sum%10;
            rev1=rev1*10+j;
            sum=sum/10;
        }
        if(rev1==cpy1)
        {
            return cpy1;
        }
        else
        {
            return -1;
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a number");
        long a;
        a=sc.nextInt();
        long result=isSumPalindrome(a);
        System.out.println(result);
    }
}




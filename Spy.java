package com.company;
import java.util.*;
public class Spy {
    public static void main(String[] args) {
        int n,i=0,d=0,sum=0,p=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the Number");
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            p=p*d;
            n=n/10;
        }
        if(p==sum)
            System.out.println("YES it is a Spy Number");
        else
            System.out.println("NO it is not a Spy Number");
    }
}

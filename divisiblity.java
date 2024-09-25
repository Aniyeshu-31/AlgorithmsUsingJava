package com.company;
import java.util.*;
public class divisiblity {
    public static void main(String[] args) {
        int arr[];

        Scanner sc=new Scanner(System.in);
        int n,num=0,rev=0,i=0,d=0;
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            d=0;
            d=arr[i]%10;
            num=num*10+d;
        }
//        while(num!=0)
//        {
//            int div=num%10;
//            rev=rev*10+div;
//            num=num/10;
//        }
        System.out.println(num);
//        System.out.println(rev);
//        if(rev%10==0)
//        {
//            System.out.println("Yes");
//        }
//        else
//        {
//            System.out.println("No");
//        }

    }
}

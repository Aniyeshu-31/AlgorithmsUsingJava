package com.company;

import java.util.*;

public class missing_elements {
    public static void main(String[] args) {
        int arr[];
        int n,i=0,s=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the number");
        n=sc.nextInt();
        arr=new int[n-1];
        for(i=0;i<=n-2;i++)
        {
            System.out.println("input the elements");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
//        for(i=0;i<n-2;i++)
//        {
//            if((arr[i]+1)== arr[i+1])
//            {
//                continue;
//            }
//            else
//            {
//                 s= arr[i]+1;
//
//            }
//        }
//        System.out.println(s);
        for(i=0;i<n-1;i++)
        {
            sum=sum+arr[i];
        }
        s= (n*(n+1))/2;
        System.out.println(s-sum)   ;
    }
}

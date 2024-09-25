package com.company;
import java.util.*;
public class SumOfEvenOdd {
    public static void main(String[] args) {
        int arr[];
        int n;
        int sumEven=0,SumOdd=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        int i=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(i=0;i<n;i++){
           if(arr[i]%2==0) {
               sumEven += arr[i];
           }
           else{
               SumOdd+=arr[i];
           }


        }
        System.out.println("Sum of Even:- "+sumEven);
        System.out.println("Sum of Odd:- "+SumOdd);
    }
}

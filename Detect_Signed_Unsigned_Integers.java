package com.company;

import java.util.Scanner;

public class Detect_Signed_Unsigned_Integers {
    public static void main(String[] args) {
        int x,y,res=0;
        int arr[]={1,2,2,3,3};
        res=arr[0];
        Scanner sc=new Scanner(System.in);
        System.out.println("input two numbers");
//        x=sc.nextInt();
//        y=sc.nextInt();
//        int z= x^y;
//        z=z>>31;
//        if((z & 1)==1)
//        {
//            System.out.println("Opposite signed Integers");
//        }
//        else
//        {
//            System.out.println("Not Opposite signed Integers");
//        }
        int i=0;
        for(i=1;i<5;i++){
            res=res^arr[i];
        }
        System.out.println(res);
    }
}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int n,i=0;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("input the size");
        n=sc.nextInt();
        System.out.println("input the element to search");
        int k=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=r.nextInt(n);
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                System.out.println("Element found at index: "+i);
            }
        }
        System.out.println("Element not found");
    }
}

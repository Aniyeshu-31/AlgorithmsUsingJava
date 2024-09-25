package com.company;

import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        int n;
        int arr[];
        Scanner sc=new Scanner(System.in);
        System.out.println("input the Size");
        n=sc.nextInt();
        arr=new int[n];
        int i=0,j=0,temp=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            temp=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}

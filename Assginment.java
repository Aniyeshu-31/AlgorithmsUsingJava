package com.company;

import java.util.Arrays;
import java.util.Random;

public class Assginment {
    static int binary(int arr[],int n, int k)
    {
        int l=0,h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==k)
            {
                return mid;

            }
            else  if(k<arr[mid])
            {
                h=mid-1;

            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
    static int linear(int arr[],int n, int k)
    {
        int i=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)

            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Long start = System.nanoTime();         int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            Random ran = new Random();

            arr[i] = ran.nextInt(1000, 10000);
        }
        Arrays.sort(arr);         for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(binary(arr, 10000, 5000));         System.out.println();
        System.out.println(linear(arr, 10000, 5000));
        System.out.println();
        Long end = System.nanoTime();
        Long ElapsedTime = end - start;
        System.out.println(ElapsedTime);

    }
}

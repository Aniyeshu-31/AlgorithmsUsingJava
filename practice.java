package com.company;

import java.util.*;

public class practice {
    static int linearsearch(int arr[],int k)
    {
        int i=0,j=0,flag=0,index=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                flag=1;
                index=i;
                break;
            }
        }
        if(flag==1)
        return index;
        else
            return -1;
    }
    static void reverse(int arr[],int l)
    {
        int i=0;
        int b[]=new int[l];
        for(i=0;i<l;i++)
        {
            b[i]=arr[(l-1)-i];
        }
        for(i=0;i<l;i++)
        {
            System.out.print(b[i]+" , ");
        }
        System.out.println();
    }
    static void maxAbsoluteDiff(int arr[],int l)
    {
        int i=0,max=0,min=0,mabs=0;
        max=arr[0];
        min=arr[0];
        for(i=1;i<l;i++)
        {
          if(arr[i]>max)
          {
              max=arr[i];
          }
          else if(arr[i]<min)
          {
              min=arr[i];
          }
        }
        mabs=Math.abs(max-min);
        System.out.println("Absolute Difference is :"+mabs);

    }
    public static void main(String[] args) {
       int a[],k,i=0,n=0;
       Scanner sc=new Scanner(System.in);
       k=sc.nextInt();
       n=sc.nextInt();
       a=new int[n];
       for(i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
        System.out.println(linearsearch(a,k));
        reverse(a,n);
        maxAbsoluteDiff(a,n);
    }
}

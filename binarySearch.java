package com.company;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int l,h,n,i=0;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("input the size");
        n=sc.nextInt();
        System.out.println("input the element to search");
        int k=sc.nextInt();
        int a[]=new int[n];
        l=0;
        h=n-1;
        for(i=0;i<n;i++)
        {
            a[i]=r.nextInt(n);
        }
        Arrays.sort(a);
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==k)
            {
                System.out.println("element found at index="+mid);
                break;
            }
            else if(a[mid]>k)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        System.out.println("Element not found");
    }
}

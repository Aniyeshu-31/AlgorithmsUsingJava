package com.company;
import java.util.*;
public class bubble_Sort {
   static  void bubbleSort(int a[],int n){
        int i=0;
        int j=0;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
    }
    public static void main(String[] args) {
        int a[];
        int n;
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++) {
            System.out.println("Input the elements in the array");
            a[i] = sc.nextInt();
        }
        bubbleSort(a,n);

    }
}

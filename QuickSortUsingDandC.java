package com.company;

import java.util.Random;

public class QuickSortUsingDandC {
    static void swap(int arr[],int a,int b){     // swap function to swap the indexes
        int temp=0;
        temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    static int partition(int l,int h,int arr[],int pi){         // partition function to calculate the pivot1 and pivot2
        int pivot1=arr[l];
        int pivot2 =arr[h];
        int i=l;
        int j=h;
        while(i<j){
            while(arr[i]<=pivot1)
            {i++;}
            while(arr[j]>pivot1){j--;}
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,l);
        return j;          // returning the pivot
    }
    static void QuickSort(int l,int h,int arr[]){
        if(l<h) {
            int pivot1 = partition(l, h, arr,arr[l]);    // calling the partition function to store the pivot1;
            int pivot2 = partition(l, h, arr,arr[h]);    // calling the parition function to store the pivot2
            QuickSort(l,pivot1-1,arr);
            QuickSort(pivot1+1, pivot2-1, arr);   // calling the QuickSort function (Recursion)
            QuickSort(pivot2 + 1, h, arr);

        }
    }
    public static void main(String[] args) {
        Random r=new Random();
        int arr[]=new int[10];
        for(int k=0;k<10;k++){
            arr[k]=r.nextInt(1,100);        // Taking the random input in the array
        }
        QuickSort(0,9,arr);
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+",");
        }
    }
}

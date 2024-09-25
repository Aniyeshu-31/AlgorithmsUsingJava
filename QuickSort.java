package com.company;
import java.util.*;
public class QuickSort {
    static void swap(int arr[],int a,int b){
        int temp=0;
        temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    static int partition(int l,int h,int arr[]){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(arr[i]<=pivot)
            {i++;}
            while(arr[j]>pivot){j--;}
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,j,l);
        return j;
    }
    static void QuickSort(int l,int h,int arr[]){
        if(l<h) {
            int pivot = partition(l, h, arr);
            QuickSort(l, pivot - 1, arr);
            QuickSort(pivot + 1, h, arr);
        }
    }
    public static void main(String[] args) {
        Random r=new Random();
        int arr[]=new int[10];
        for(int k=0;k<10;k++){
            arr[k]=r.nextInt(1,100);
        }
        QuickSort(0,9,arr);
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+",");
        }
    }
}

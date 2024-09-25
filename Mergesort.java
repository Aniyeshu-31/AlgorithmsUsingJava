package com.company;

import java.util.*;

public class Mergesort {

    static void MergeSort(int arr[],int l,int r ) {
             int i=0;
            if (l < r) {

                int mid = (l + r) / 2;
                MergeSort(arr, l, mid);
                MergeSort(arr, mid + 1, r);
                Merge(arr, l, mid, r);
            }

        }
         static void Merge(int arr[],int l,int mid,int r){
            int i=l;
            int b[]=new int[arr.length];
            int j=mid+1;
            int k=l;
            while(i<=mid && j<=r) {
                if (arr[i] < arr[j]) {
                    b[k] = arr[i];
                    i++;
                    k++;
                }
                else{
                    b[k]=arr[j];
                    j++;
                    k++;
                }

            }
            if(i>mid)
            {
                while(j<=r)
                {
                    b[k]=arr[j];
                    j++;
                    k++;
                }

            }
            else
            {
                while(i<=mid)
                {
                    b[k]=arr[i];
                    i++;
                    k++;
                }
            }
            for(k=l;k<=r;k++)
            {
                arr[k]=b[k];
            }

        }
        static void display(int arr[])
        {
            int i=0;
            for(i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+",");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int arr[]={5,2,6,1};
            MergeSort(arr,0,3);
            display(arr);
        }
    }



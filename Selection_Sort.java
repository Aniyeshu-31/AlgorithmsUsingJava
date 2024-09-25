package com.company;

import java.util.Random;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        int n;
        int arr[];
        Scanner sc=new Scanner(System.in);
        Random r=new Random(100);
        System.out.println("input the Size");
        n=sc.nextInt();
        arr=new int[n];
        int i=0,j=0,temp=0;
        long start=System.nanoTime();
        for(i=0;i<n;i++)
        {
            arr[i]=(r.nextInt(900))+100;
        }
        for(i=0;i<n;i++)
        {
            int min=i;
            for(j=i+1;j<n;j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                if(min!=i)
                {
                    temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        long end=System.nanoTime();
        long elapsedtime= end-start;
        System.out.println();
        System.out.print(elapsedtime);
        }


    }


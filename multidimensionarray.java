package com.company;
import java.util.*;
public class multidimensionarray {
    public static void main(String[] args) {
        //int a[];//1D array
        int arr[][];//2D array
        int sum=0,N,M;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr=new int[N][M];

        for(int i=0;i<N;i++)
        {
            for (int j = 0; j < M; j++)
            {
                System.out.println("input the elements");
                arr[i][j] = sc.nextInt();
            }

        }

        for(int i=0;i<arr.length;i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "  ");
                sum = sum + arr[i][j];

            }
            System.out.println();
        }
        System.out.println(sum);
    }
}

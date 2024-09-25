package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int a[],i=0,sum=0; // a={3,1,2,4,0,1,3,2};
        Scanner sc=new Scanner(System.in);
        int left[];
        int right[];
        int n;
        n=sc.nextInt();
        a=new int[n];
        left=new int[n];
        right=new int[n];
        Arrays.fill(left,0);
        Arrays.fill(right,0);
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        left[0]=a[0];
        right[n-1]=a[n-1];
        for(i=1;i<=n-1;i++){
            left[i]=Math.max(left[i-1],a[i]);
        }
//        for(i=0;i<n-1;i++){
//            System.out.print(left[i]+" ");
//        }
//        System.out.println();

        for(i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],a[i]);
        }
//        for(i=n-1;i>=0;i--)
//        {
//            System.out.print(right[i]+" ");
//        }
//        System.out.println();


        for(i=0;i<n;i++)
        {
            sum+=(Math.min(left[i],right[i])-a[i]);
        }
        System.out.println(sum);

    }
}

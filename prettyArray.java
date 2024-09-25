package com.company;
import java.util.*;
public class prettyArray {
    public static void main(String[] args) {
        int a[],c=0;
        int n;
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the Size of the Array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("input the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(a[0]==0)
            {
                if(a[i] % i==0)
                {
                    c++;
                }
            }
        }
        if(c==n-1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}

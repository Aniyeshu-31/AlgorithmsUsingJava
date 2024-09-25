package com.company;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
       int n=sc.nextInt();
       int d=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("input the elements");
            arr[i]=sc.nextInt();
        }
        int n1[]=new int[d];
        int n2[]=new int[n-d];
        int n3[]=new int[n];

        for(i=0;i<d;i++)
        {
            n1[i]=arr[i];

        }
        int v=d;
        for(i=0;i<(n-d);i++)
        {
            if(v<n)
            n2[i]=arr[v];
            v++;

        }
        int s=0;
        for(i=0;i<n;i++)
        {
            if(i<(n-d))
            {
                n3[i]=n2[i];
            }
            else if(s<d)
            {
                n3[i]=n1[s];
                s++;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(n3[i]+" ");
        }


    }
}

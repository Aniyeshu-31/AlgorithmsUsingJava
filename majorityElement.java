package com.company;

import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        int a[],size;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int i=0,index=0;
        int count=1;
        a=new int[size];
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<size;i++)
        {
            if(a[i]==a[index])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                index=i;
                count=1;
            }
        }
        int c=0;
        for(i=0;i<size;i++)
        {
            if(a[i]==a[index])
            {
                c++;
            }
        }
        if(c>(size/2))
        {
            System.out.println(a[index]);
        }
        else
            System.out.println(-1);
    }
}

package com.company;
import java.util.*;
public class loop {
    public static void main(String[] args) {
        int a=0 , b=2, n,i=0,j=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                j=a+j+(j*b);
                System.out.println(j);
            }
        }
    }
}

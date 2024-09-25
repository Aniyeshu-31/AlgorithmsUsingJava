package com.company;
import java.util.*;
public class newpattern {
    public static void main(String args[])
    {
        int n,i=0,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the limit");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=(n-i+1);k++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

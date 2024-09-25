package com.company;

import java.util.Scanner;

public class matrics {
    public static void main(String[] args) {
        int m[][];
        int n;
        int i=0,j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input n");
        n=sc.nextInt();
        m=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                m[i][j]=sc.nextInt();
            }

        }
        for(i=0;i<m.length;i++)
        {
            for(j=0;j<m[i].length;j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        for(i=0;i<m.length;i++)
        {
            for(j=0;j<m[i].length;j++)
            {
                if(i<=j)
                {
                    System.out.print(m[i][j]);
                }
                else if(i>j)
                {
                    m[i][j]=0;
                    System.out.print(m[i][j]);
                }
            }
            System.out.println();
        }
    }
}

package com.company;

import java.util.Scanner;

public class rotationby90 {
    public static void main(String[] args) {
        int a[][],i=0,j=0;
        a=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("input the element");
                a[i][j]=sc.nextInt();
            }

        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
        for(i=2;i>=0;i--)
        {
            for(j=2;j>=0;j--)
            {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }

    }
}

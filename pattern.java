package com.company;
import java.util.*;

public class pattern {
    public static void main(String args[])
    {
        {
                int i=0,j=0,k=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("input the limit ");
                int n=sc.nextInt();
                for(i=1;i<=n;i++)
                {
                    for(j=1;j<=2*(n-i);j++)
                    {
                        System.out.print(" ");
                    }
                    for(k=1;k<=i;k++)
                    {
                        if(k==1 || k==i ||i==n)
                        {
                            System.out.print(" * ");
                        }
                        else
                        {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }

            }
        }




    }


package com.company;

import java.util.Scanner;

public class Generalized_pattern {
    public static void main(String[] args) {
        int i=0,j=0,k=0;
        String s;
        String w="",w1="";
        Scanner sc=new Scanner(System.in);
         s=sc.next();
//        int n=sc.nextInt();
        int l=s.length();
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<=2*(l-i);j++)
            {
                System.out.print(" ");
            }

            for(k=0;k<=i;k++)
            {
                if(k==0 ||  k==i)
                {
                    System.out.print(s.charAt(i));

                }
                if(i==l-1)
                {
                    System.out.print("    ");
                }
                else
                {
                    System.out.print("    ");

                }
            }
            System.out.println();
        }
        for(i=0;i<l;i++)
        {
            w1=w1+" "+s.charAt(i);
        }
        for(i=1;i<l;i++) {
            char ch = s.charAt(i);
            w=ch+" "+w;
        }

        System.out.println("   "+w+w1);

    }
    }


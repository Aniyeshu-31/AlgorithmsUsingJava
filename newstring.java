package com.company;
import java.util.Scanner;
public class newstring {
    public static void main(String[] args) {
        String s;
        int i=0,j=0,l=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the word");
        s=sc.next().toUpperCase();
        l=s.length();
        for(i=0;i<=l-1;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(k=i;k<=(l-1);k++)
            {
                System.out.print(s.charAt(k)+"  ");
            }
            System.out.println();

        }

    }
}

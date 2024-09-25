package com.company;

import java.util.Scanner;

public class CountX {
    public static void main(String[] args) {
        int L,R,X;
        int i=0,c=0,cpy=0;
        Scanner sc=new Scanner(System.in);
        L=sc.nextInt();
        R=sc.nextInt();
        X=sc.nextInt();
        for(i=L+1;i<R;i++) {
            cpy=i;
            while ( i != 0) {
                int d = i % 10;
                if (d == X)
                {
                    c++;
                }
                i=i/10;
            }
            i=cpy;
        }
        System.out.println(c);
    }
}

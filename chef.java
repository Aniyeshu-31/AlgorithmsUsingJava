package com.company;

import java.util.Scanner;

public class chef {
    public static void main(String[] args) {
        int t,c=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            c=0;
            int N;
            N=sc.nextInt();
            while(N!=0)

            {
                int S=(int)Math.sqrt(N);
                c++;
                N=(N)-(S*S);
            }
            System.out.println(c);
            t--;
        }
    }
}

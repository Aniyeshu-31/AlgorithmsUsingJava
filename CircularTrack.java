package com.company;

import java.util.Scanner;

public class CircularTrack {
    public static void main(String[] args) {
        int A,B,M;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the test cases");
        int t=sc.nextInt();
        int c=0;
        while(t>0)
        {
            A=sc.nextInt();
            B=sc.nextInt();
            M=sc.nextInt();
            int maxdis=0,mindis=0;
            maxdis=M-A;
            mindis=M-B;
            if(maxdis>mindis)
            {
                 c=0;
                do {
                    A--;
                    c++;
                }while(A!=B);
                System.out.println(c);
            }
            else if(mindis>maxdis)
            {
                c=0;
                do{
                    M--;
                    c++;
                }while(M!=B);
                System.out.println(c);
            }

            t--;
        }
    }
}


/*
1 98 100
100-1 = 99;
100-98 = 2;
40 30 50
2 1 2
 */
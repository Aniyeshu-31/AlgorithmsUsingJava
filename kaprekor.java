package com.company;
import java.util.Scanner;
public class kaprekor {
    public static void main(String[] args) {
        long i, j, sum = 0, N, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number");
        N=sc.nextInt();
        long cpy=N;
        long sq=N*N;
        while(N!=0)
        {
            c++;
            N=N/10;
        }
        double L= (sq)/Math.pow(10,c);
        double R= (sq)%Math.pow(10,c);
            sum= (long)(L+R);
            if(sum==cpy)
            System.out.println("yes");
            else
            System.out.println("no");
    }
}


package com.company;

import java.util.Scanner;

public class staticintialization {
    static int L;
    static int B;
    static  int area;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        L=sc.nextInt();
        B=sc.nextInt();
        if(B<=0 || L<=0)
        {
            System.out.println("java.lang.Exception: Breadth and Height must be positive");

        }
        else
        {
            area=L*B;
        }
        System.out.println(area);
    }
}

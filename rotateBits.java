package com.company;

import java.util.Scanner;

public class rotateBits {
    public static void main(String[] args) {
        int n=0,d=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        d=sc.nextInt();
        System.out.println(n<<d);
    }
}

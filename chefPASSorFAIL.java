package com.company;

import java.util.Scanner;

public class chefPASSorFAIL {
    public static void main(String[] args) {
        int t,n,x, p; int marks=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the test cases");
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            x=sc.nextInt();
            p=sc.nextInt();
            marks = 3*x + (-1)*(n-x);
            if(marks>=p)
                System.out.println("PASS");
            else
                System.out.println("FAIL");
            t--;
        }
    }
}

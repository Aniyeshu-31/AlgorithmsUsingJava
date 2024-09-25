package com.company;
import java.util.*;
public class methods{
    int maxOfnumbers(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }

    }
    static void hi() {
        System.out.println("Hi, it is a nice day");

    }
    public static void main(String args[])
    {
        int n,m;
        methods obj=new methods();
        Scanner sc=new Scanner(System.in);
        System.out.println("input two numbers");
        n=sc.nextInt();
        m=sc.nextInt();
         System.out.println(obj.maxOfnumbers(n,m));

       hi();
    }
}

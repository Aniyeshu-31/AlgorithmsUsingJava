package com.company;
import java.util.Scanner;
public class string1 {
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("input a string in upper case");
        s=sc.next();
        String w=" ";
        w=s.toLowerCase();
        System.out.println(w);
    }
}

package com.company;
import java.util.*;
public class program {
    public static void main(String args[])
    {
        String s,w=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("input a sentence");
        s=sc.nextLine().toUpperCase();
        int l=s.length();
        for(int i=0;i<=l-1;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                System.out.println(w);
                w=" ";
            }
        }
    }
}

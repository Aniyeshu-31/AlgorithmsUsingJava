package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class javaprogram {
    public static void main(String args[])
    {
        String s,w=" ";int i=0;char ch=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("input a word");
        s=sc.next();
        int l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=ch+w;
        }
        System.out.println(w.toUpperCase());
    }
}

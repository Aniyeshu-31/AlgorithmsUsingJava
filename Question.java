package com.company;
import java.util.*;
public class Question {
    public static void main(String[] args) {
        int c[],i=0; char ch=' ';
        c=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println();
        String s;
        s=sc.next();
        int l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                c[0]++;
            }
            else if(Character.isLowerCase(ch))
            {
                c[1]++;
            }
            else if(Character.isDigit(ch))
            {
                c[2]++;
            }
            else
            {
                c[3]++;
            }

        }
        for(i=0;i<4;i++)
        {
            System.out.println(c[i]);
        }
    }
}

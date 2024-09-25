package com.company;
import java.util.*;
public class togglecase {
    public static void main(String[] args) {
        String s,w=" "; char ch=' ',ch1=' ',ch2=' ';
        int i=0,l=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the word");
        s=sc.next();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch1=Character.toLowerCase(ch);
                w=w+ch1;
            }
            else
            {
                ch2=Character.toUpperCase(ch);
                w=w+ch2;
            }
        }
        System.out.println(w);


    }
}

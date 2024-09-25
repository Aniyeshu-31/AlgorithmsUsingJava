package com.company;

import java.util.Scanner;

public class invertSentenceWithWords {
    public static void main(String[] args) {
        String s,S=" ",w1="";
        String w="";  String str=" ";
        int i=0;
        char ch=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("input a sentence");
        s=sc.nextLine();
        s=s.trim();
        int lastindex= s.lastIndexOf(".");

        String s1= s.substring(lastindex+1);
        int l1=s1.length();
        for(i=0;i<l1;i++)
        {
            w1=s1.charAt(i)+w1;
        }
        S=""+w1+".";
        int l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!='.')
            {
                w=ch+w;
            }
            else
            {
                str=str+w+".";
                w="";
            }
        }
        S=str+""+S;
        S=S.replace("."," ");
        S=S.trim();
        S=S.replace(" ",".");
        System.out.println(S);
    }

    }


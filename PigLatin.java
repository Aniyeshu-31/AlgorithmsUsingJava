package com.company;


import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        String word, word1=" ",word2=" ",Newword=" "; char ch=' ';
        int l=0,i=0,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word");
        word=sc.next().toUpperCase();
        l=word.length();
        for ( i = 0; i < l; i++)
        {
            ch=word.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            word1=word.substring(i);
            word2=word.substring(0,i);
            Newword= word1+""+word2+""+"AY";
        }
        System.out.println(Newword);
    }
}

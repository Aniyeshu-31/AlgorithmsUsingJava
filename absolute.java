package com.company;
import java.util.*;
public class absolute {
    public static void main(String[] args) {
      String s,S=" ";
      String w="";  String str=" ";
      int i=0;
      char ch=' ';
      Scanner sc=new Scanner(System.in);
        System.out.println("input a sentence");
        s=sc.nextLine();
        s=s.trim();
        int lastindex= s.lastIndexOf(".");

        String s1= s.substring(lastindex+1);
        S=""+s1+".";
        int l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!='.')
            {
                w=w+ch;
            }
            else
            {
                str=w+"."+str;
                w="";
            }
        }
        S=S+""+str;
        S=S.replace("."," ");
        S=S.trim();
        S=S.replace(" ",".");
        System.out.println(S);
    }
}

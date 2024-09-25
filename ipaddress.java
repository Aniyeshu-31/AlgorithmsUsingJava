package com.company;
import java.util.*;
public class ipaddress {
    public static void main(String[] args) {
        int A,B,C,D; String S=" ";
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        D=sc.nextInt();
        if((A>=0 && A<=255) && (B>=0 && B<=255) && (C>=0 && C<=255) && (D>=0 &&                  D<=255))
        {
            String s1=Integer.toString(A);
            String s2=Integer.toString(B);
            String s3=Integer.toString(C);
            String s4=Integer.toString(D);
            int l1=0,l2=0,l3=0,l4=0;
            l1=s1.length();
            l2=s2.length();
            l3=s3.length();
            l4=s4.length();
            if(l1<=3 && l2<=3 && l3<=3 && l4<=3)
            {
                S=s1+"."+s2+"."+s3+"."+s4;
            }
            else
            {
                System.out.println("false");
            }
            if(S.startsWith(".") || S.endsWith(".")==false)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        else
        {
            System.out.println("false");
        }
    }
}

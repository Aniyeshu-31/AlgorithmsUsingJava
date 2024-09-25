package com.company;
import java.util.*;
import java.util.Random;
public class Generating_Passwords_OTPS {
    public static void main(String[] args)
    {

        int length=8;
        int length1=5;
        System.out.println(password(length));
        System.out.println(otp(length1));
    }
    static char[] password(int len) {
        int i = 0;
        Random r = new Random();
        String alpha1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alpha2 = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialchar = "!@#$%^&*()";
        char p[] = new char[len];
        String val = alpha1 + alpha2 + numbers + specialchar;
        for (i = 0; i < len; i++) {
            p[i] = val.charAt(r.nextInt(val.length()));
        }

        return p;

    }
    static char[] otp(int l)
    {
        int i=0;
        String num1="0123456789";
        Random r = new Random();
        char ch[]=new char[l];
        for(i=0;i<l;i++)
        {
            ch[i]=num1.charAt(r.nextInt(num1.length()));
        }
        return ch;
    }

}

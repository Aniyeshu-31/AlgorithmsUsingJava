package com.company;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int n,i=0,f=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            f=f*i;
        }
        System.out.println(f);
    }
//        int n=100;
//        String s=Integer.toString(n);
//        System.out.println(s);
//    }
}

package com.company;
import java.util.*;

public class binaryusingbitwise {
    public static void main(String[] args) {
        int n;String w="";
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=0;
        for(i=31;i>=0;i--)
        {
            int k = n>>i;
            if((k & 1)==1)
             w=w+k;
            else
                w=w+k;


        }
    }
}

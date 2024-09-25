package com.company;
import java.util.*;
public class format {
    public static void main(String[] args) {
        String s1;
        String s2;
        String s3;int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        sc.nextLine();
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=sc.nextLine();
        System.out.printf("%-15s%03d\n",s1,n1);
        System.out.printf("%-15s%03d\n",s2,n2);
        System.out.printf("%-15s%03d\n",s3,n3);
    }
}

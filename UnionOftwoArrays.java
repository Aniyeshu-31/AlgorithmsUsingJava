package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnionOftwoArrays {
    static  int c;
    void UnionOftwoArrays(int c){
        this.c=c;
    }
    public static  void main(String[] args) {
        int a[],b[],i=0,j=0;
        Scanner sc=new Scanner(System.in);
        int n,m;
        ArrayList<Integer> al=new ArrayList<>();
        n=sc.nextInt();
        boolean visited=false;
//        m=sc.nextInt();
        a=new int[n];
        b=new int[n];
        System.out.println("input the elements in array a[]");
        for(i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("input the elements in array b[]");
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(i=0;i<n;i++)
        {
            al.add(Math.min(a[i],b[i]));
        }
        for(i=0;i<n;i++){
            System.out.print(al.get(i)+",");
        }
    }
}

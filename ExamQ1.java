package com.company;
import java.util.*;
public class ExamQ1 {
    static boolean equalize(int a[],int b[],int n,int m){
        if(n==m) {
            int flag = 0;
            int size = a.length;
            for (int i = 0; i < size; i++) {
                if (a[i] == b[i]) {
                    flag = 1;
                }
            }
            if (flag == 1) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the size of the first array");
        n=sc.nextInt();
        System.out.println("Input the size of the second array");
        m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        System.out.println(equalize(a,b,n,m));

    }
}

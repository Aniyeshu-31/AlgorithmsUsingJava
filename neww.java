package com.company;
import java.util.*;
public class neww {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int n;
        int v=1;
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the limit");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            k=i;
            for(j=1;j<=i;j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}

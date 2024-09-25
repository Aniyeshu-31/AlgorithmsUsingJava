package com.company;
import java.util.*;
public class Unique_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int arr[]=new int[n];
        int i=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        res=arr[0];
        for(i=1;i<n;i++){
            res=res^arr[i];
        }
        System.out.println(res);
    }
}

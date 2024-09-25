package com.company;
import java.util.*;
public class cuberoot {
    static boolean cuberoot(int n) {
        int i = 0,flag=0;
        if (n == 1) {
            return true;
        }
        int l=0,h=n;
        while(l<=h) {
            int mid = (l + h) / 2;
            if ((mid * mid * mid) == n) {
                return true;
            }
           else if ((mid * mid * mid) < n) {
                l = mid + 1;
            } else if ((mid * mid*mid) > n) {
                h = mid - 1;
            }
        }
            return false;
    }

    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
        System.out.println(cuberoot(n));
    }
}

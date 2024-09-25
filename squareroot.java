package com.company;
import java.util.*;
public class squareroot {
    static boolean squareroot(int n) {
        int i = 0,flag=0;
        if (n == 1) {
            return true;
        }
        int l=0,h=n;
        while(l<=h){
            int mid = (l + h) / 2;
            if ((mid * mid) == n) {
               flag=1;
               break;
            }
          else  if ((mid * mid) < n) {
                l = mid+1;
            } else if ((mid * mid) > n) {
                h = mid-1;
            }
        }
        if(flag==1)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(squareroot(n));
    }
}


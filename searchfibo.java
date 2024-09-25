package com.company;
import java.util.*;
public class searchfibo {
    static long search(int arr[], int n) {
        int i = 0, a = 0, b = 1, c = 0,q=0;
        for (i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            if (arr[i] == c )
            {
                q++;
            }
        }
        if(q!=0)
            return q;
        else
            return 0;



        }
        public static void main(String args[]) {
        int d;
        Scanner sc = new Scanner(System.in);
        d = sc.nextInt();
        int a[] = new int[d];
        for (int j = 0; j < d; j++) {
            a[j] = sc.nextInt();
        }
        long h = search(a, d);
        System.out.println(h);
    }
}


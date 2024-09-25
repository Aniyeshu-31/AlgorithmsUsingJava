package com.company;
import java.util.*;
public class codeforces {
    public static void main(String[] args) {
        int n, c = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
           for (int i = 0; i < n; i++) {
                if (a[i] >= a[k-1] && a[i]>0) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }

 
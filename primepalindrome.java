package com.company;
import java.util.*;
public class primepalindrome {
    static boolean palin(int n) {
        int rev = 0, d = 0;
        int cpy = n;
        while (n != 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        if (rev == cpy)
            return true;
        else
            return false;
    }

    static boolean prime(int n) {
        long i = 0, c = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }

        }
        if (c == 2)
            return true;
        else
            return false;

    }

    static Long getPPS(int a, int b) {
        int j = 0;
        long sum = 0;
        for (j = a; j <= b; j++) {
            if((palin(j)&&prime(j)==true))
            {
                sum=sum+j;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, m;
        k = sc.nextInt();
        m = sc.nextInt();
        long s=getPPS(k, m);
        System.out.println(s);
    }
}

package com.company;
import java.util.*;
public class primenumberssum {

    static boolean prime(int k) {
        int j = 0, l = 0;

        for (j = 1; j <= k; j++) {
            if (k % j == 0) {
                l++;
            }
        }
        if (l == 2)
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
        int n, i = 0, c = 0, digit = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        n = sc.nextInt();
        while (n != 0)
        {
            digit = n % 10;
          boolean check= prime(digit);
          if(check==true)
          {
              sum = sum + digit;
          }
            n = n / 10;
        }
        System.out.println(sum);
    }
}





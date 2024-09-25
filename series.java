package com.company;
import java.util.*;
public class series {
    public static void main(String[] args) {
        double x, sum = 5.0, sum1 = 0.0, s = 0.0;
        double pow = 0.0, t = 0.0;
        int i = 0, f = 1, j = 0, k = 0, f1 = 1, p = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the digit x");
        x = sc.nextDouble();
        for (i = 1; i <= 5; i++) {

            if (i != 2 && i != 5)
            {
                f = 1;
                pow = 0.0;
                for (p = 1; p <= i + 1; p++)
                {
                    f = f * p;
                }
                pow = Math.pow(x, i);
                t = -(pow / f);
                sum = sum + (t);
            }
            else {
                f = 1;
                pow = 0.0;
                for (p = 1; p <= i + 1; p++) {
                    f = f * p;
                }
                pow = Math.pow(x, i);
                t = (pow / f);
                sum = sum + (t);
            }

        }
        System.out.println(sum);
    }
}



package com.company;

import java.util.Scanner;

public class Apattern {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 1;i <= 9;i++)
        {
            for (j = 1; j <= 4; j++)
            {
                if (i == 1 || i == 5)
                {
                    System.out.print(" *");
                }
                else if (j == 1 || j == 4)
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

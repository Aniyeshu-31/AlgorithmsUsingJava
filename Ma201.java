package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Ma201 {
    public static int permutations(int n, int k) {
        int result = 1;
        for (int i = 0; i < k; i++) {
            result *= n - i;
        }
        return result;
    }

    //Method for #combinations
    public static int combinations(int n, int m) {
        if (m >= n / 2) {
            int result = m + 1;
            int i = 2;
            while (i <= n - m) {
                result *= m + i;
                result /= i++;
            }
            return result;
        }
        int result = n - (m - 1);
        int i = 2;
        while (i <= m) {
            result *= n - (m - i);
            result /= i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("#Enter n: ");
        int n = scan.nextInt();
        System.out.print("#Enter k: ");
        int k = scan.nextInt();

        System.out.println("Permutations");
       //Permutation with replacement
        System.out.println("\nWith replacement: " + (int) Math.pow(n, k));
        //Permutations without replacement
        System.out.println("Without replacement: " + permutations(n, k));
        System.out.println("\nCombination");
       //Combinations with replacement
        System.out.println("\nWith replacement: " + combinations(n + k - 1, k));
       //Combinations without replacement
        System.out.println("Without replacement: " + combinations(n, k));
    }
}

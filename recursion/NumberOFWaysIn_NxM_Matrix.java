package recursion;

import java.util.Scanner;

public class NumberOFWaysIn_NxM_Matrix {
    static int ways ( int n, int m)
      {
    if (n == 1 || m == 1)
        return 1;
    else
        return ways(n, m - 1) + ways(n - 1, m);
     }

    public static void main(String[] args) {
            int n1, m1;
            Scanner sc = new Scanner(System.in);
            n1 = sc.nextInt();
            m1 = sc.nextInt();
            System.out.println(ways(n1, m1));
        }
    }


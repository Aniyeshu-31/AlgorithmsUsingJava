package recursion;

import java.util.Scanner;

public class Josephus_problem {
    static int Josephus(int n , int k)
    {
        if(n==1)
            return 0;
        else
            return (Josephus(n-1,k)+k)%n;
    }

    public static void main(String[] args) {
         int n1,k1;
         Scanner sc=new Scanner(System.in);
         System.out.println("Input N and K");
         n1=sc.nextInt();
         k1=sc.nextInt();

        System.out.println(Josephus(n1,k1)+1);
    }
}

package recursion;
import java.util.*;
public class Exponent {
    static int powerCalc(int a,int b) {
        int ans = 0,ans1=0;
        if (b == 0)
            return 1;
         if (b % 2 == 0) {
             ans = powerCalc(a*a, b / 2);
             return ans;
         }
       else
           ans1=a*powerCalc(a,b-1);
          return ans1;
    }

    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("input the values of Base and Index");
        m=sc.nextInt();
        n=sc.nextInt();
        int g=powerCalc(m,n);
        System.out.println(g);
    }
}

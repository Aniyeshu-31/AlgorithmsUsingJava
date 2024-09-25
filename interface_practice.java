package com.company;
import java.util.*;
interface advancedArithmetic
{
    int divisors_sum(int n);
}
class MyCalculator implements advancedArithmetic
{
   public int divisors_sum(int n)
    {
        int i=0,sum=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
public class interface_practice {
    public static void main(String[] args) {
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        MyCalculator myc=new MyCalculator();
      int s=  myc.divisors_sum(k);
        System.out.println(s);
    }
}

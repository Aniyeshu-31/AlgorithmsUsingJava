package com.company;
import java.util.*;
abstract class operation{
  abstract double sum(double a ,double b);
  abstract double product(double p,double q);
  abstract double difference(double d1,double d2);
  abstract double divide(double i,double j);
}
class operate extends operation{
   double sum(double a,double b){
        return a+b;
    }
    double product(double p1,double p2) {
       return p1*p2;
    }
    double difference(double d1,double d2){
        return d1-d2;
    }
    double divide(double i,double j){
        return i/j;
    }
}
public class AbstractClassImplementation {
    public static void main(String[] args) {
        double a,b,c,d;
        Scanner sc=new Scanner(System.in);
         operate obj=new operate();
        System.out.println("Input four Numbers:- ");
         a=sc.nextDouble();
         b=sc.nextDouble();
         c=sc.nextDouble();
         d=sc.nextDouble();
        double s= obj.sum(a,b);
        double p=obj.product(b,c);
        double di=obj.difference(c,d);
        double div=obj.divide(d,b);

        System.out.println("The Sum of Two Numbers is = "+s);
        System.out.println("The Product of Two Numbers is = "+p);
        System.out.println("The Difference of Two Numbers is = "+di);
        System.out.println("The Division of Two Numbers is = "+div);
    }
}

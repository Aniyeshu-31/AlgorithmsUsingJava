package com.company;
import java.util.*;
class Arithmatic
{
    int add(int a,int b)
    {
        int sum=a+b;

        return sum;
    }
}
class Adder extends Arithmatic
{
    void display()
    {
        System.out.println("My superclass is:"+" "+"Arithmetic");
    }
}

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Adder a=new Adder();
        int s= a.add(x,y);
        a.display();
        System.out.println(x+" "+y+" "+s);

    }
}

package com.company;
import java.util.*;
class oops {
        void add(int a,int b)
        {
            int sum=0;
            sum=a+b;
            System.out.println(sum);
        }
        public static void main(String args[])
        {
            int m=0,n=0;
            Scanner sc=new Scanner(System.in);
            oops obj=new oops();
            m=sc.nextInt();
            n=sc.nextInt();
            obj.add(m,n);
        }
}


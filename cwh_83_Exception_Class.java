package com.company;

import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString() {
        return  " I am toString()";
    }

    @Override
    public String getMessage() {
        return " I am getMessage()";
    }
}
public class cwh_83_Exception_Class {
    public static void main(String[] args) {
        int a = 0,b=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b=sc.nextInt();
        if ( b==0) {
            try {
//                throw new MyException();
                throw new ArithmeticException("not divisible by 0");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
//                System.out.println(e);
//                e.printStackTrace();

                System.out.println("Finished");
            }
        }
            else
            {
                System.out.println(a / b);
                System.out.println("Yes Finished");
            }
        }
    }


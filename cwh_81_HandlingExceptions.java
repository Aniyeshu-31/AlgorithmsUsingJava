package com.company;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class cwh_81_HandlingExceptions {
    public static void main(String[] args) {
//        int marks[] = new int[3];

       Locale indiaLocale= new Locale("en","IN");
        NumberFormat nf= NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println(nf.format(1233.242));
//        marks[0] = 7;
//        marks[1] = 67;
//        marks[2] = 45;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the Array index");
//        int ind = sc.nextInt();
//        System.out.println("enter the number with which you want to divide with");
//        int number = sc.nextInt();
//        try {
//            System.out.println("The value  at array index entered is:" + marks[ind]);
//            System.out.println("The value of array-value/number is:" + marks[ind] / number);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("ArithmeticException occured!!");
//            System.out.println(e);
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("ArrayIndexOutOfBoundsException occured!!");
//            System.out.println(e);
//        }
//        catch(Exception e)
//        {
//            System.out.println("some other exception occured!!");
//            System.out.println(e);
//        }

    }
}

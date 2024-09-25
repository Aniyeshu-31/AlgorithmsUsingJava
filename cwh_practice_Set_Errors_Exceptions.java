package com.company;

import java.util.Scanner;
class errors extends Exception
{
    @Override
    public String toString() {
        return "Maximum value of i is reached";
    }

    @Override
    public String getMessage() {
        return "Maximum value of i is reached";
    }
}
public class cwh_practice_Set_Errors_Exceptions {
 public static void wrap()
 {
     boolean flag = true;
     Scanner sc = new Scanner(System.in);
     int ind = 0;
     int i = 0;
     int marks[] = new int[3];
     marks[0] = 7;
     marks[1] = 67;
     marks[2] = 45;
     while (flag && i < 5) {
         try {
             System.out.println("Enter the value of Index");
             ind = sc.nextInt();
             System.out.println("The value of marks[ind]= " + marks[ind]);
             break;
         } catch (Exception e) {

             System.out.println("Enter a valid index");
             i++;
         }
     }
     if(i>=5)
     {
         try {
             throw new errors();
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
     }
 }
    public static void main(String[] args) {
        // Problem 1
        // Syntax Error - int a
//        int a = 78;
//        int b = 2000;
//        int year_born = 2000 - 78; // Logical Error
//        System.out.println(6 / 0); // Arithmetic Error (Runtime Error).

        // Problem 2

//        try {
//            int result = 6 / 0;
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("Hehe");
//        } catch (ArithmeticException e) {
//            System.out.println("Haha");
//        }

        // Problem 5
        wrap();




    }
}

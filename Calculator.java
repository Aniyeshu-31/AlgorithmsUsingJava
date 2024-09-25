package com.company;
import packages.calculator;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);


      calculator obj=new calculator() {
          @Override
          public void add(double a,double b) {
              System.out.println(a+b);
          }

          @Override
          public void subtract(double a,double b) {
              System.out.println(a-b);
          }

          @Override
          public void multiply(double a,double b) {
              System.out.println(a*b);
          }

          @Override
          public void divide(double a,double b) {
              System.out.println(a/b);
          }

          @Override
          public void percentage(double a,double b) {
              System.out.println((a/b)*100);
          }

          @Override
          public void squareroot(double a,double b) {

              System.out.println(Math.sqrt(a));
              System.out.println(Math.sqrt(b));
          }
      };
        System.out.println("Input the operator Symbol");
        char ch=sc.next().charAt(0);
      switch(ch){
          case '+':
              System.out.println("Input the Digits in the variables");
               double a=sc.nextDouble();
               double b=sc.nextDouble();
               obj.add(a,b);
               break;
          case '-':
              System.out.println("Input the Digits in the variables");
               double a1=sc.nextDouble();
               double b1=sc.nextDouble();
               obj.subtract(a1,b1);
               break;
          case '/':
              System.out.println("Input the Digits in the variables");
              double a2=sc.nextDouble();
              double b2=sc.nextDouble();
              obj.divide(a2,b2);
              break;
          case '%':
              System.out.println("Input the Digits in the variables");
              double a3=sc.nextDouble();
              double b3=sc.nextDouble();
              obj.percentage(a3,b3);
              break;
          case 's':
              System.out.println("Input the Digits in the variables");
              double a4=sc.nextDouble();
              double b4=sc.nextDouble();
              obj.squareroot(a4,b4);
              break;
          default:
              System.out.println("Wrong Input Given!!");
              break;

      }
      }

      }


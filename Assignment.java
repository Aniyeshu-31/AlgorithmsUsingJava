package com.company;

public class Assignment{ private
final int x = 10; void m1()
{ final int x = 20;
    System.out.println(x);
}
    public static void main(String[] args) {
        Assignment obj = new Assignment(); obj.m1();
    } }

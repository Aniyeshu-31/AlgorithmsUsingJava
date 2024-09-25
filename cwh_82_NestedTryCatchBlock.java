package com.company;

import java.util.Scanner;

public class cwh_82_NestedTryCatchBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Index");
        int ind=sc.nextInt();
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 67;
        marks[2] = 45;
        try{
            System.out.println("Welcome to video no. 82");
            try {
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Sorry this index does not exists");
                System.out.println("Exception in Level 2");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in Level 1");
        }
    }
}

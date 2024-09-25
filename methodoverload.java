package com.company;

public class methodoverload {
    static void change(int []arr)
    {
        arr[0]=100;
    }
    static void telljoke()
    {
        System.out.println("I am Aniyeshu Verma");
    }

    public static void main(String[] args)
    {
        int marks[]={54,43,23,35,23};
        change(marks); //in case of array we pass the reference of the object of the array
//        telljoke();
        System.out.println(marks[0]);
    }
}

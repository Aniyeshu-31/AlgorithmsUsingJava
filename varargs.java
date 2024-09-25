package com.company;

public class varargs {
    static int sum(int x,int ...arr)
    {
        int result=0;
        result=x;
        for(int a: arr)
        {

            result=result+a;

        }
        return result;
    }

    public static void main(String[] args) {
            System.out.println(sum(1,2));
            System.out.println(sum(1,2,3));
            System.out.println(sum(1,2,3,4,5));
            System.out.println(sum(1,2,3,4,5,6));
    }
}

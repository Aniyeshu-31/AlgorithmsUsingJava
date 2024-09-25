package com.company;

public class cwh_85_finally {
    public static int greet() {
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
        } finally
        {
            System.out.println("Cleaning up resources...This is the end of the function");
        }
        return 0;
    }
    public static void main(String[] args) {
//        System.out.println(greet());
        int a=8,b=9;
        while(true)
        {
            try {
                System.out.println(a/b);
            }
            catch(Exception e)
            {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for the value of b = "+ b);
            }
            b--;
        }
        try {
            System.out.println(50/3);
        }
        finally {
            System.out.println("yes I am finally");
        }

    }
}


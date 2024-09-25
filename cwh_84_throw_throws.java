package com.company;
class NegativeRadiusException extends Exception
{
    @Override
    public String toString() {
        return "Radius cannot be negative showed by toString()";
    }

    @Override
    public String getMessage() {
        return  "Radius cannot be negative showed by getmessage()";
    }
}
public class cwh_84_throw_throws {
    public static double area(int r) throws NegativeRadiusException
    {
        if(r<0)
        {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
//        try {
//            int c = divide(6, 0);
//            System.out.println(c);
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
        try {
            double c = area(-9);
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}


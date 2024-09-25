package com.company;

public class cwh_80_trycatchblock {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("we fail to divide. reason:");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}

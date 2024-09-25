package com.company;

public class cwh_107_methodTags {
    /**
     *
     * @param args These are the arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am Main Method");
    }

    /**
     *
     * @param i This is first number to Add
     * @param j This is second number to Add
     * @return  Sum of two Nummbers
     * @throws Exception if  i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i, int j) throws Exception
    {
        if(i==0)
        {
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}

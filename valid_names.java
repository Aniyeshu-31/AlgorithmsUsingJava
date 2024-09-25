package com.company;

import java.util.Scanner;

public class valid_names {
    public static void main(String[] args) {
        int len = 0, i = 0, flag = 0, n, j = 0, k = 0;
        boolean isValid = false;
        String name[];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        name = new String[n];

        for (i = 0; i < name.length; i++)
        {
            name[i] = sc.next();
            name[i] = name[i].trim();
        }
        for(i=0;i<name.length;i++)
        {
            for(j=1;j<name[i].length();j++)
            {
                if((Character.isLetter(name[i].charAt(0))==true) && (Character.isLetterOrDigit(name[i].charAt(j)) || name[i].charAt(j)=='_'))
                {
                    isValid=true;
                }
                else
                {
                    isValid=false;
                }
            }
            if(isValid==true)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
    }
}

package com.company;
import java.util.*;
public class EVEN_ODD_USING_BITWISE_OPERATOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if((n & 1)==1)
        {
            System.out.println("Odd Integer");
        }
        else
        {
            System.out.println("Even Integer");
        }
    }
}
// Concept used is Bit masking

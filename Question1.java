package com.company;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        String s, w = " ", w1 = " ";
        char ch = ' ', ch1 = ' ';
        int i = 0;
        int l = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word");
        s = sc.next().toUpperCase();
        l = s.length();
        for (i = 0; i < l; i++)
        {
            ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                ch1=s.charAt(i+1);
                w=w+""+ch1;

            }
            else
            {
                w=w+ch;
            }

        }
        System.out.println(w.trim());
    }
}

package com.company;
import java.util.*;
public class new_program1
{

    public static void main(String args[]) {
        int l = 0, i = 0;
        String s, w = " ";
        char ch = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("input a name");
        s = sc.nextLine();
        s = s.trim();
        s = " " + s;
        int lastIndex = s.lastIndexOf(' ');
        l = s.length();
        for (i = 0; i < l; i++)
        {
            ch = s.charAt(i);
            if (ch == ' ') {
                w = w + s.charAt(i + 1) + ".";
            }
        }
        w=w.substring(0,4);
           w=w+"."+" "+s.substring(lastIndex+1,l);
            System.out.println(w.toUpperCase());
        }
    }



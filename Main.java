package com.company;
import java.util.*;

 public class Main {

     public static void main(String[] args) {
         String s, word= " ";
         int l = 0, i, c = 0;
         char ch = ' ';
         Scanner sc = new Scanner(System.in);
         System.out.println("input a Sentence");
         s = sc.nextLine().toUpperCase();
         s=s+" ";
         l = s.length();

         for (i = 0; i<l; i++) {
             ch = s.charAt(i);
             if (ch != ' ')
             {
                 word =word+ch;
             }

             else {
                 System.out.println(word);
                 word=" ";

             }
         }
     }
 }

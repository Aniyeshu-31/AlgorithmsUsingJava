package com.company;

import java.util.*;

public class parenthesisMatching {
  static  boolean isParenthesisMatching(String str) {
      Stack<Character> s = new Stack<>();
      char curr = ' ';
      for (int i = 0; i < str.length(); i++) {
          curr = str.charAt(i);
      }
      if (isOpening(curr)) {
          s.push(curr);
      } else {
          if (s.isEmpty()) {
              return false;
          } else if (!isMatching(s.peek(), curr)) {
              return false;
          } else {
              s.pop();
          }
      }
//      if (s.isEmpty()) {
//          return true;
//      }
      return true;
  }
    static boolean isOpening(char ch){
        return (ch=='(' || ch=='{' || ch=='[');
    }
    static boolean isMatching(char a,char b)
    {
        return ((a=='(' && b==')')||(a=='{' && b=='}')||(a=='[' || b==']'));
    }
    public static void main(String[] args) {
        String ss="";
        Scanner sc=new Scanner(System.in);
        ss=sc.next();
        System.out.println( isParenthesisMatching(ss));
    }
}

package com.company;
import java.util.*;
public class capgemini {
    public static String f(String str,int len){
        Stack<Character> st = new Stack<Character>();
        String newstr="";
        for(int i = 0;i < len;i++){
            if (str.charAt(i) == '#') {
                st.push(str.charAt(i));
            }
            else {
                newstr += str.charAt(i);
            }
        }
        while(!st.empty()){
            newstr = st.pop()+ newstr;
        }
        return newstr;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Input The String");
          String str = sc.next();
          int len = str.length();
          System.out.println(f(str,len));
    }
}
// a#b#cqwew#
// output : ###abcqwew
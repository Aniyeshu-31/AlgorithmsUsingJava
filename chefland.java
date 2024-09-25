package com.company;
import java.util.*;
public class chefland {
    public static void main(String[] args) {
        String tags="h1",tagsend="",tagstart="";
        String s="<h1>hello</h1>";
        tagstart="<"+""+tags+""+">";
        tagsend="<"+"/"+tags+">";
        if(s.startsWith(tagstart) && s.endsWith(tagsend))
        {
            System.out.println("true");
        }

//        int n=0;
//        int i=0,a1=0;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("input the test cases");
//        n=sc.nextInt();
//        for(i=0;i<n;i++) {
//            int c = 0;
//            int n1 = 0;
//            while (n1 < 7) {
//                a1 = sc.nextInt();
//                if (a1 == 1) {
//                    c++;
//                }
//                n++;
//            }
//
//
//        if(c>3) {
//            System.out.println("YES");
//        }
//        else
//            System.out.println("NO");

        }

   }


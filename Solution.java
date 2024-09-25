package com.company;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {



    public static void main(String[] args) {
      Scanner sc=new Scanner("Integer is 1212");

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                System.out.println(sc.next());
            }
            else
            {
                sc.next();
            }

        }
    }
}


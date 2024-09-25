package com.company;
import java.util.*;
public class maximum_repeating_character {
    public static void main(String[] args) {
        String l;
        int index = 0,t=0, i = 0, m = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the string");
        l = sc.next();
        int a[] = new int[256];
        for (char c : l.toCharArray()) {
            index = (int) c;
            a[index]++;
        }
        int max = a[0];
        for (i = 1; i < 256; i++) {
            if (a[i] > max) {
                max = a[i];
                t=i;
            }
        }
        System.out.println((char)t);

    }
}

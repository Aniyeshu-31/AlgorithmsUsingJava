package com.company;
import java.util.*;
public class output {
    static void play(int y){
        int b=0;
        for(int a=1;y>0;b+=(y%2)*a,a*=10,y/=2);
        System.out.println(b);
    }
    public static void main(String[] args) {
         play(11);
    }
}

package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.ArrayList;
class Mygenerics<T1>
{
    int val;
    private T1 t1;

    public Mygenerics(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }
}
public class cwh_110_javaGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> a =new ArrayList();
//        a.add("str1");
        a.add(456);
        a.add(45);
//        try {
//            int arr =(int) a.get(0);
//            System.out.println(arr);
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
       Mygenerics<String> g1=new Mygenerics(23,"Mystring");
      String str = g1.getT1();
        System.out.println(str);
        System.out.println(g1.getVal());
    }
}

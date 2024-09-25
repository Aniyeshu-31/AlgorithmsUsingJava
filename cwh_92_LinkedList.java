package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class cwh_92_LinkedList {
    public static void main(String[] args) {
        int i=0;
        LinkedList<Integer> l1 =new LinkedList<>();
        LinkedList<Integer> l2 =new LinkedList<>();
        l2.add(15);
        l2.add(14);
        l2.add(78);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(5);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(l2);
        l1.addLast(89);
        l1.addFirst(788);
//        System.out.println(l1.indexOf(6));
//        l1.clear(); clears all the elements in the arraylist
//        System.out.println(l1.contains(90));
//        l1.set(1,32);
        for(i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
            System.out.print(" , ");
        }
//        System.out.println();
//        System.out.println(l1.get(7));


    }

}

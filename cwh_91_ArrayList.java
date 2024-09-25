package com.company;
import java.util.*;
public class cwh_91_ArrayList {
    public static void main(String[] args) {
        int i=0;
        ArrayList<Integer> l1 =new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>(5);
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
        l1.remove(2);
        System.out.println(l1.indexOf(6));
        System.out.println(l1.size());
//        l1.clear(); clears all the elements in the arraylist
        System.out.println(l1.contains(90));
        l1.set(1,32);
        for(i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i)+" ");
            System.out.print(" , ");
        }
        System.out.println();
        System.out.println(l1.get(7));
    }
}

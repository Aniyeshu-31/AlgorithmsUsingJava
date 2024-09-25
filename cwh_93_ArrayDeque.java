package com.company;

import java.util.ArrayDeque;

public class cwh_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1= new ArrayDeque<>();
        a1.add(6);
        a1.add(89);
        a1.addFirst(9);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
    }
}

package com.company;

import java.util.HashSet;

public class cwh_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> h= new HashSet<>(6,0.5f);
        h.add(6);
        h.add(8);
        h.add(10);
        h.add(7);
        h.add(11);
        h.add(80);
        System.out.println(h);
//        System.out.println(h.clone()); clone() returns the Shallow clone of the HashSet
        // Question-: why we are not directly adding the elements in the array rather than making a HashSet
        // Ans-: This is because in searching the elements in the array time complexity is more and if we Search an element in the HashSet the time complexity is
        // Constant O(1).
    }
}

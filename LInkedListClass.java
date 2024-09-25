package com.company;
import java.util.*;
import java.io.*;
public class LInkedListClass {

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    public static void main(String[] args) {
        Node head;
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();
        head = new Node(2);
        Node second=new Node(3);
        Node Third=new Node(4);
        head.next=second;
        head.next.next=Third;
        System.out.print(head+"->");
        System.out.print(head.next+"->");
        System.out.print(head.next.next+"->");
    }
}

package com.company;
import java.util.*;
public class List {
   static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node reverse(Node node){
        Node prev=null;
        Node curr=node;
        Node temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        node=prev;
        return node;
    }
    public static void main(String[] args) {
        List llist=new List();
        llist.head = new Node(1);
        Node Second= new Node(2);
        Node third=new Node(3);
        llist.head.next = Second;
        Second.next = third;
        System.out.println("Linked List: ");
        Node curr= llist.head;
        curr= llist.reverse(curr);
        System.out.println("Linked List after reversing: ");
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
    }
}

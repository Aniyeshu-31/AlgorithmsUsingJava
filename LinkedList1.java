package com.company;
import java.util.*;
public class LinkedList1<T> {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public void addfirst(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public void addlast(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
        }
        Node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=new_node;
        new_node=currnode;
    }
    public void display() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "->");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
            LinkedList1<Integer> l=new LinkedList1<>();
        l.addfirst(2);
        l.addfirst(1);
        l.addlast(3);
        l.display();
            }
    }


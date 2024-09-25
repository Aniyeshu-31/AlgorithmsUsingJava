package com.company;
 class Node{
    int data;
    Node next;
    Node(int a){
        data=a;
        next=null;
    }
}
public class Application {

    public static void Linkedlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String []args){
        Node head=new Node(3);
        head.next=new Node(9);
        head.next.next=new Node(1);
        head.next.next.next=new Node(9);
        Linkedlist(head);
    }
}
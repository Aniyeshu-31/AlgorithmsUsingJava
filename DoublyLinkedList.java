package com.company;

public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
            this.prev=null;
        }
    }
    void deleteAthead(int pos){
        head=head.next;
        head.prev=null;
    }
    void delete(int pos){
        Node temp=head;
        int count=1;
        if(pos==1){
            deleteAthead(pos);
            return;
        }
        while(temp!=null && count!=pos){
            temp=temp.next;
            count++;
        }
        temp.prev.next=temp.next;
        if(temp.next!=null) {
            temp.next.prev = temp.prev;
        }

    }
    void insertAthead(int data){
        Node n=new Node(data);
        n.next=head;
        if(head!=null){
            head.prev=n;
        }
        head=n;
    }
    void insertAttail(int data){
        Node n=new Node(data);
        Node temp=head;
        if(head==null){
            insertAthead(data);
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        n.prev=temp;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
           Node head=null;
           DoublyLinkedList l=new DoublyLinkedList();
           l.insertAttail(1);
           l.insertAttail(2);
           l.insertAttail(3);
           l.insertAthead(5);
           l.delete(1);
           l.delete(3);
           l.display();
    }
}

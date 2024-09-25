package com.company;

public class CircularLinkedLIst1 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void insertAthead(int data){
        Node n=new Node(data);
        Node temp=head;
        if(head==null){
            n.next=n;
            head=n;
            return;
        }
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=n;
        n.next=head;
        head=n;
    }
    void insertAttail(int data){

        Node n=new Node(data);
        Node temp=head;
        if(head==null){
            insertAthead(data);
            return;
        }
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=n;
        n.next=head;
    }
    void display(){
        Node temp=head;
       do{
           System.out.print(temp.data+"->");
           temp=temp.next;
       }while(temp!=head);
        System.out.println("NULL");
    }
    public static void main(String[] args) {
         CircularLinkedLIst1 l=new CircularLinkedLIst1();
         l.insertAttail(1);
         l.insertAttail(2);
         l.insertAttail(3);
         l.insertAttail(6);
         l.insertAttail(7);
         l.insertAttail(8);
         l.display();
    }
}

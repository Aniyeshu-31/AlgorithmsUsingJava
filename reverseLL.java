package com.company;

public class reverseLL {
    Node head;
    Node prev;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void addfirst(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    void addlast(int data){
        Node new_node=new Node(data);
        Node temp=head;
        if(head==null){
            head=new_node;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
        new_node=temp;
    }
    Node reverse(){
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            head=prev;
        }

        return prev;
    }
    void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        reverseLL l=new reverseLL();
        l.addfirst(5);
        l.addfirst(4);
        l.addfirst(3);
        l.addfirst(2);
//        l.addfirst(1);
//        l.addlast(1);
//        l.addlast(2);
        l.addlast(1);
        l.display();
        l.reverse();
        l.display();
    }
}

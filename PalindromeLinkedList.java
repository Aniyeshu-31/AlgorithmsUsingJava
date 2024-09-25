package com.company;

public class PalindromeLinkedList {
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
        Node curr = middle();
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            head=prev;
        }

        return prev;
    }
    Node middle(){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    boolean isPalindrome(){
        if(head==null){
            return true;
        }
        Node curr=head;
        Node last=reverse();
        while(last!=null){
            if(last.data!=curr.data) {
                return false;
            }
                curr=curr.next;
                last=last.next;
            }
        return true;
        }
        void display(){
        Node temp=head;
        do{

            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=null);
            System.out.println("null");
        }

    public static void main(String[] args) {
       PalindromeLinkedList l=new PalindromeLinkedList();
       l.addfirst(1);
       l.addfirst(2);
       l.addfirst(1);
        l.addlast(2);
        l.addlast(1);
       l.display();
       System.out.println(l.isPalindrome());

    }
}

package com.company;
import java.util.*;
public class Stack_Using_LinkedList<T>{
    Node head;
    int size;
    class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            next=null;
        }
    }
    public Stack_Using_LinkedList(){
            head=null;
            size=0;
        }
        void push(T data){
            Node temp=new Node(data);
            temp.next=head;
            size++;
            head=temp;
        }
        T peek(){
           if(head==null){
               System.out.println("Stack Underflow");
           }
           return (T)head.data;
    }
     public T pop(){
        if(head==null){
            System.out.println("Stack Underflow");
        }
        T res=(T)head.data;
        size--;
        return res;
    }
    boolean isEmpty(){
        return head==null;
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
        Stack_Using_LinkedList<Integer> s=new Stack_Using_LinkedList<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        System.out.println(s.pop());
    }
}

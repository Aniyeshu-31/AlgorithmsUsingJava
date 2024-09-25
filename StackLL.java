package com.company;
import java.util.*;

class StackLL<T>{
     Node head;
     int length;


    class Node
    {
        T data;
        Node next;
        public Node(T data){
            this.data = data;
        }
    }


    public StackLL(){
        this.head = null;
        this.length = 0;
    }


    public int length(){
        return length;
    }


    public boolean isEmpty(){
        return length == 0;
    }

    public void push(T data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        length++;

    }


    public void show(){
        if(isEmpty())
            System.out.println("Stack is Empty!!");
        else{
            Node temp = head;
            System.out.print("Stack Elements : ");
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

        }
    }

    public T Empty(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
        }
        return head.data;
    }


    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
        }
        T result = head.data;
        head = head.next;
        length--;
        return result;
    }

    public static void main(String args[]){
        StackLL<Number> stack= new StackLL<Number>();
        stack.push(20.00);
        stack.push(100);
        stack.push(40.12f);
        stack.push(50);
        stack.show();
        System.out.println("\nTop of stack : "+stack.Empty());
        System.out.println("length : "+stack.length());
        stack.pop();
        stack.show();
        System.out.println("\nTop of stack : "+stack.Empty());
        System.out.println("length : "+stack.length());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
        System.out.println("length : "+stack.length());
    }
}


package com.company;

class Queue<T>{
    class qNode<T>{
        T k;
        qNode next;
        public qNode(T key)
        {
            this.k = key;
            this.next = null;
        }
    }
    qNode front,rear;
    public Queue(){
        this.front=null;  // These are two pointers front and rear used to implement Queue using Linked List.
        this.rear=null;
    }
    void enqueue(T k){
        qNode temp=new qNode(k);
        if(this.rear==null){
            this.front=temp;
            this.rear=temp;
            return;
        }
        this.rear.next=temp;
        this.rear=temp;
    }
    void dequeue(){
        if(this.front==null){
            return;
        }
        qNode temp=this.front;
        this.front=this.front.next;
        if(this.front==rear){
            this.rear=null;
        }
    }
}
public class QueueLL {
    public static void main(String[] args) {
        Queue<Integer> q=new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println("The Front Element of the Queue:-  "+q.front.k);

        q.dequeue();
        System.out.println("The First Element of the Queue after Dequeing:- "+q.front.k);

        q.dequeue();
        System.out.println("The First Element of the Queue after Dequeing one more Time:- "+q.front.k);
        System.out.println("The Rear Element of the Queue:- "+q.rear.k);
        q.enqueue(6);
        System.out.println("The Rear Element of the Queue after Enqueing:- "+q.rear.k);
        System.out.println();
        System.out.println();
        Queue<String> q1=new Queue<>();
        q1.enqueue("I");
        q1.enqueue("Love");
        q1.enqueue("Java");
        q1.enqueue("Programming");
        q1.enqueue("Language");
        System.out.println("The Front Element of the Queue:-  "+q1.front.k);

        q1.dequeue();
        System.out.println("The First Element of the Queue after Dequeing:- "+q1.front.k);

        q1.dequeue();
        System.out.println("The First Element of the Queue after Dequeing one more Time:- "+q1.front.k);
        System.out.println("The Rear Element of the Queue:- "+q1.rear.k);
        q1.enqueue("Jquery");
        System.out.println("The Rear Element of the Queue after Enqueing:- "+q1.rear.k);
    }
}


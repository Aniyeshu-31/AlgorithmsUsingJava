package com.company;


public class CircularLinkedList {
    public class Node{
        Object data;
        Node next;
        public Node(Object data) {
            this.data = data;
        }
    }
    public Node head = null;
    public Node t = null;
    public void addAtFront(Object data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            t = newNode;
            newNode.next = head;
        }
        else{
            t.next = newNode;
            newNode.next = head;
            head = newNode;

        }
    }
    public void addAtEnd(Object data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            t = newNode;
            newNode.next = head;
        }
        else {
            t.next = newNode;
            t = newNode;
            t.next = head;
        }
    }
    public void deleteVal(Object value){
        Node current = head;
        if (head.data==value) {
            t.next=head.next;
            head=head.next;
        }

        while (current.next.next!=head && current.next.data!=value) {
            current = current.next;
            if (current.next==head) {
                System.out.println("element not found");
                return;
            }
        }
        current.next=current.next.next;
    }
    // public void reversePrintList

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            System.out.print("->");
            do{
                System.out.print( current.data +"->");
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
    public static void main(String[] args) {
       CircularLinkedList c = new CircularLinkedList();
        c.addAtEnd("Hi,there");
        c.addAtEnd(2);
        c.addAtEnd(3);
        c.addAtEnd("Java is the best language");
        c.display();
        c.deleteVal(3);
        c.display();
        c.addAtFront(true);
        c.display();
    }
}

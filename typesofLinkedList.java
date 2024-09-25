package com.company;
public class typesofLinkedList {
class Node {
    Object data;
    Node previous;
    Node next;

    public Node(Object data) {
        this.data = data;
    }
}
    Node head, tail = null;
    public void addNode(Object data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void addAtFirst(Object data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else {
            head.previous=newNode;
            newNode.next=head;
            newNode.previous=null;
            head=newNode;
        }
    }
    public void deleteNode(Object val){
        Node current = head;
        while(current.data!=val){
            current=current.next;
        }
        if (current.next==null) {
            current.previous.next=null;
        }
        current.previous.next=current.next;
        current.next.previous=current.previous;
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("doubly linked list: ");
        System.out.print("null<->");
        while(current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
    }
    public void displayReverse() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("doubly linked list in Reverse: ");
        System.out.print("null<->");
        while (current.next!=null) {
            current=current.next;
        }
        while(current != null) {
            System.out.print(current.data + "<->");
            current = current.previous;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        typesofLinkedList dL = new typesofLinkedList();
        dL.addNode(1);
        dL.addNode("Java is one of the most Finest Language");
        dL.addNode("The concept of linked list is very interesting ");
        dL.addNode(3);
        dL.addNode(5);
        dL.display();
        dL.deleteNode(3);
        dL.display();
        dL.displayReverse();
        dL.addAtFirst("Hello world");
        dL.display();
    }
}

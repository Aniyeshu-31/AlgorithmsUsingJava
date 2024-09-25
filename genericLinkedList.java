package com.company;

class node<T> {
    T data;
    node<T> next;
    node(T data)
    {
        this.data = data;
        this.next = null;
    }
}
class list<T> {
    node<T> head;
    private int length = 0;
    list() {
        this.head = null;
    }
    void add(T data)
    {
        node<T> temp = new node<>(data);
        if (this.head == null) {
            head = temp;
        }
        else {
            node<T> X = head;
            while (X.next != null) {
                X = X.next;
            }
            X.next = temp;
        }
        length++;
    }
    void add(int position, T data)
    {
        if (position > length + 1) {
            System.out.println("Position Unavailable in LinkedList");
            return;
        }
        if (position == 1) {
            node<T> temp = head;
            head = new node<T>(data);
            head.next = temp;
            return;
        }
        node<T> temp = head;
        node<T> prev = new node<T>(null);
        while (position - 1 > 0) {
            prev = temp;
            temp = temp.next;
            position--;
        }
        prev.next = new node<T>(data);
        prev.next.next = temp;
    }
    void remove(T key)
    {
        node<T> prev = new node<>(null);
        prev.next = head;
        node<T> next = head.next;
        node<T> temp = head;
        boolean exists = false;
        if (head.data == key) {
            head = head.next;
            exists = true;
        }
        while (temp.next != null) {
            if (String.valueOf(temp.data).equals(
                    String.valueOf(key))) {

                prev.next = next;
                exists = true;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;
        }
        if (exists == false && String.valueOf(temp.data).equals(String.valueOf(key))) {
            prev.next = null;
            exists = true;
        }
        if (exists) {
            length--;
        }
        else {
            System.out.println("Given Value is not present in linked list");
        }
    }
    void clear()
    {
        head = null;
        length = 0;
    }
    boolean empty()
    {
        if (head == null) {
            return true;
        }
        return false;
    }

    int length() {
        return this.length;
    }
    public String toString()
    {
        String S = "{ ";
        node<T> X = head;
        if (X == null)
            return S + " }";
        while (X.next != null) {
            S+= String.valueOf(X.data) + " -> ";
            X = X.next;
        }
        S += String.valueOf(X.data);
        return S + " }";
    }
}

public class genericLinkedList {
    public static void main(String[] args)
    {
        list<Integer> list1 = new list<>();
        System.out.println("Integer LinkedList created as list1 :");
        list1.add(100);
        list1.add(200);
        list1.add(300);
        System.out.println("list1 after adding 100,200 and 300 :");
        System.out.println(list1);
        list1.remove(200);
        System.out.println("list1 after removing 200 :");
        System.out.println(list1);
        list<String> list2 = new list<>();
        System.out.println("\nString LinkedList created as list2");
        list2.add("hello");
        list2.add("world");
        System.out.println("list2 after adding hello and world :");
        System.out.println(list2);
        list2.add(2, "hello");
        System.out.println("list2 after adding hello at position 2 :");
        System.out.println(list2);
        list<Float> list3 = new list<>();
        System.out.println("\nFloat LinkedList created as list3");
        list3.add(20.25f);
        list3.add(50.42f);
        list3.add(30.99f);
        System.out.println("list3 after adding 20.25, 50.42 and 30.99 :");
        System.out.println(list3);
        System.out.println("Clearing list3 :");
        list3.clear();
        System.out.println(list3);
    }
}

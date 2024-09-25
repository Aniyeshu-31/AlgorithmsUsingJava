package com.company;
import java.util.*;
class ArrayLinearList {
    Object[] element;
    int size;

    public ArrayLinearList(int initialCapacity) {
        if (initialCapacity < 1)
            throw new IllegalArgumentException("initialCapacity must be greater than or equal to 1");
        element = new Object[initialCapacity];
        size = 0;
    }

    public ArrayLinearList() {
        this(10);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public int indexOf(Object Elem) {
        for (int i = 0; i < size; i++)
            if (element[i].equals(Elem))
                return i;
        return -1;
    }

    public Object remove(int index) {
        Object removedElement = element[index];
        for (int i = index + 1; i < size; i++)
            element[i - 1] = element[i];
        element[--size] = null;
        return removedElement;
    }

    public void add(int index, Object E) {
        if (size == element.length) {
            changeArrayLength(2*element.length);
        }
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = E;
        size++;
    }

    public void add(Object Element) {
        add(size, Element);
    }

    public void changeArrayLength(int len) {
        Object[] temp = new Object[len];
        for (int i = 0; i < size; i++) {
            temp[i] = element[i];
        }
        element = temp;
    }
    String tString()
    {
        String str="";
        for(int i=0;i<size;i++)
        {
            str=str+""+element[i];
        }
        return str;
    }
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(element[i] + " ");
        }
        System.out.println();
    }
}
public class Arraylisr11 {

    public static void main(String[] args) {
        ArrayLinearList list = new ArrayLinearList();
        list.add("DragonFruit");
        list.add(29);
        list.add((Object)8.0);
        list.add((Object)true);
        list.add((Object)'p');
        list.add((Object)"pi");
        list.printArray();
        list.add(3,(Object)"Apple");
        list.printArray();
        list.add(1,(Object)'d');
        list.printArray();
        list.remove(3);
        System.out.println("Array list after removing the elements");
        list.printArray();
        System.out.println(list.indexOf('p'));
        System.out.println(list.tString()+" ");

    }
}

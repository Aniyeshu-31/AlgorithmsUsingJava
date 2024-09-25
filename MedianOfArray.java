package com.company;

import java.util.*;

class Median{
    PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minheap=new PriorityQueue<>();
    void insertElement(int num){
        if(maxheap.isEmpty() || maxheap.peek()>=num)
            maxheap.add(num);
        else
            minheap.add(num);

        if(maxheap.size()>minheap.size()+1){
            minheap.add(maxheap.poll());
        }
        else if(maxheap.size()<minheap.size()){
            maxheap.add(minheap.poll());
        }
    }
    double FindMedian(){
       if(maxheap.size()== minheap.size()){
           return (maxheap.peek()/2.0 + minheap.peek()/2.0);
       }
       return maxheap.peek();
    }
}
public class MedianOfArray {
    public static void main(String[] args) {
        Median obj=new Median();
        obj.insertElement(3);
        obj.insertElement(1);
        System.out.println(obj.FindMedian());
        obj.insertElement(5);
        System.out.println(obj.FindMedian());
        obj.insertElement(4);
        System.out.println(obj.FindMedian());
    }
}

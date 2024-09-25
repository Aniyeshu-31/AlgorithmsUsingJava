package com.company;

import java.util.*;

class Mystack{
    ArrayList<Integer> arr;
    int top=-1;
    int size;
    Mystack(int size){
        this.size=size;
        arr=new ArrayList<>(size);
    }
    void push(int d) throws Exception {
        if(top==size-1){
            throw new Exception("Stack Overflowed");
        }
        top++;
        arr.add(top,d);
    }
    int pop() throws Exception{
        if(top==-1){
            throw new Exception("Stack Underflow");
        }
        int res= arr.get(top);
        top--;
        return res;

    }
    int peek() throws Exception{
        if(top==-1){
            throw new Exception("Stack Underflow");
        }
        return arr.get(top);
    }
    boolean isEmpty(){
       return (top==-1);
    }
    public String toString(){
        int i=0;
        String ans="";
        for(i=0;i<top;i++){
            ans+=String.valueOf(arr.get(i))+"->";
        }
        ans+=String.valueOf(arr.get(top))+"->";
        return ans;
    }
}
public class StackUsingArraylist {
    public static void main(String[] args) throws Exception {
        Mystack s=new Mystack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.pop());
    }
}

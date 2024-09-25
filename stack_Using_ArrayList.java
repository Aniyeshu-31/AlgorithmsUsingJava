package com.company;
import java.util.*;
class StackAl<T>
{
    ArrayList<T> a;
    int top=-1;
    int size;
    StackAl(int size){
        this.size=size;
        this.a=new ArrayList<T>(size);
    }
    void push(T x){
        if(top==size-1){
            System.out.println("Stack overflow");
        }
        top++;
        a.add(top,x);
    }
    T top(){
        if(top==-1) {
            System.out.println("Stack Underflow");
            return null;
        }
        else
            return a.get(top);

    }
    void pop(){
     if(top==-1){
         System.out.println("Stack underflow");
     }
     top--;

    }
    boolean isEmpty(){
        return (top==-1);
    }
    public String toString()
    {
        String ans="";
        for(int i=0;i<top;i++)
        {
            ans+=String.valueOf(a.get(i))+"->";
        }
        ans+=String.valueOf(a.get(top))+"->";
        return ans;
    }
}
public class  stack_Using_ArrayList {
    public static void main(String[] args) {
        StackAl<Integer> s1 = new StackAl<>(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("After inserting elements into the stack:  "+s1);
        s1.pop();
        System.out.println("After removing the topmost element: "+s1);

        StackAl<String> s2=new StackAl<>(3);
        s2.push("Favourite");
        s2.push("Game");
        s2.push("Basketball");
        System.out.println("After inserting elements into the stack:  "+s2);
        s2.pop();
        System.out.println("After removing the topmost element:  "+s2);

        StackAl<Float> s3= new StackAl<>(3);
        s3.push(100.f);
        s3.push(200.f);
        s3.push(300.f);
        System.out.println("After inserting the elements into the stack: "+s3);
        s3.pop();
        System.out.println("After removing the topmost element: "+s3);

    }
}

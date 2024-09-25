package com.company;

public class Driver {
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

        System.out.println();
        System.out.println();
        System.out.println();

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

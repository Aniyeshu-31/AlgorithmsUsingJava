package com.company;
//object of abstract class is not made.

abstract class parent2{
    public parent2(){
        System.out.println("I am a constructor of parent2 class");
    }
    abstract public void greet();
}
class childclass1 extends parent2{
    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }
}
abstract class child3 extends parent2{
    public void th()
    {
        System.out.println("I am Good");
    }
}
public interface abstractclass_interfaces {
    public static void main(String[] args) {
        childclass1 o=new childclass1();
        o.greet();
//        parent2 obj=new parent2(); not allowed as it is a abstract class.
//        child3 obj1=new child3();  not allowed as it is a abstract class.
    }
}

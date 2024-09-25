package com.company;

class cat{
    boolean hasFur;
    String color,breed;
    int legs,eyes;
    public void walk(){
        System.out.println("cat is  walking");
    }
    public void eat()
    {
        System.out.println("cat is eating");
    }

}
class dog{
    boolean hasFur;
    String color,breed;
    int legs,eyes;
    public void walk(){
        System.out.println("dog is  walking");
    }
    public void eat()
    {
        System.out.println("dog is eating");
        System.out.println("has legs"+" "+legs+" "+"and eyes are"+" "+eyes);
    }

}
public class java1 {
    public static void main(String args[])
    {
        dog obj=new dog();
        cat obj1=new cat();
        obj.legs=4;
        obj.eyes=2;
        obj.walk();
        obj.eat();
        obj1.walk();
        obj1.eat();
    }


}

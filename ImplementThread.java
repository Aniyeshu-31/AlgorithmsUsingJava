package com.company;

class Thrunnable implements Runnable
{
    public void run()
    {
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");
        System.out.println("I am thread 1");

    }
}
class Thrunnable2 implements Runnable
{
    public void run()
    {
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");
        System.out.println("I am thread 2");

    }
}
public class ImplementThread {
    public static void main(String[] args) {
        Thrunnable Bullet1= new Thrunnable();
        Thrunnable2 Bullet2= new Thrunnable2();
        Thread gun1= new Thread(Bullet1);
        Thread gun2=new Thread(Bullet2);
        gun2.start();
        gun1.start();
    }
}

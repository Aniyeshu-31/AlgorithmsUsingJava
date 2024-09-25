package com.company;

import java.io.DataOutput;

class Mythread extends Thread
{
    public void run()
    {
        int i=0;
        while(i<=40000)
        {
            System.out.println("My Cooking thread is running ");
            System.out.println("i am happy");
            i++;
        }

    }
}
class Mythread2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<=40000)
        {
            System.out.println("Thread2 for chatting with her");
            System.out.println("I am sad!");
            i++;
        }

    }
}
public class cwh_70_Threads {
    public static void main(String[] args) {
       Mythread t1= new Mythread();
       Mythread2 t2= new Mythread2();
       t1.start();
       t2.start();
    }
}

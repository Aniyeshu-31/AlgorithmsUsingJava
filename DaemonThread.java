package com.company;
class myDaemonThread extends Thread
{
   public myDaemonThread(String name)
    {
        super(name);
    }
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(this.getName()+""+" is a daemon Thread");
        }
        else
        {
            System.out.println(this.getName()+""+" not a daemon thread");
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        myDaemonThread t1 = new myDaemonThread("t1");
        t1.setDaemon(true);
        t1.start();
        myDaemonThread t2 = new myDaemonThread("t2");
        myDaemonThread t3 = new myDaemonThread("t3");
        t2.start();
        t3.setDaemon(true);
        t3.start();
    }
}




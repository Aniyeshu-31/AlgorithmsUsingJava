package com.company;
class MyThreadRunnable implements Runnable
{
    public MyThreadRunnable(String n)
    {
        System.out.println("name is:"+n);
    }
    public void run()
    {
        System.out.println("I am a runnable Thread");
    }
}
class Thr extends Thread
{
  public Thr(Runnable r,String name)
  {
      super(r,name);
  }
  public void run()
  {
      int i=34;
      int j=23;
      System.out.println("Thank you");
      System.out.println("Thank you");
//      while(true)
//      {
//          System.out.println("I am a thread");
//      }
  }
}
public class cwh_73_ConstructorsInThreads {
    public static void main(String[] args) {
       Runnable o=new MyThreadRunnable("Harry");
        Thr obj= new Thr(o,"Rocky");
        Thr t1=new Thr(o,"Carl Johnson");
        obj.start();
        System.out.println("The id of the thread is: "+obj.getId());
        System.out.println("The id name is: "+obj.getName());
        System.out.println("The id name is: "+t1.getName());
        System.out.println("The id of the thread is: "+t1.getId());

//        MyThreadRunnable o=new MyThreadRunnable("Aniyeshu");
//        Thread obj=new Thread(o);
//        obj.start();

    }
}

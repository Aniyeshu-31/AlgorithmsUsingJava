package com.company;
class Thr1 extends Thread {
    public Thr1(String name)
    {
        super(name);
    }

    public void run() {
        int i = 34;
        int j = 23;


      while(true)
      {
//          System.out.println("I am a thread");
          System.out.println("Thank you"+this.getName());
      }
    }
}
    public class cwh_74_ThreadPriorities {
        public static void main(String[] args) {
            // Ready Queue: T1 T2 T3 T4 T5
            Thr1 t1= new Thr1("Harry");
            Thr1 t2= new Thr1("Harry2");
            Thr1 t3= new Thr1("Harry3");
            Thr1 t4= new Thr1("Harry4");
            Thr1 t5= new Thr1("Harry5(Most Important)");
            t5.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(Thread.MIN_PRIORITY);
            t4.setPriority(Thread.MIN_PRIORITY);
            t1.setPriority(Thread.MIN_PRIORITY);
            // Default priority is the normal priority
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

        }
    }


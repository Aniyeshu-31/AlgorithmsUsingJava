package com.company;
class phone{
    public void  showTime()
    {
        System.out.println("Time is 8 am");
    }
    public void on()
    {
        System.out.println("Turning on phone....");
    }
}
class smartphone extends phone{
    public void music()
    {
        System.out.println("Playing music....");
    }
    @Override
    public void on()
    {
        System.out.println("Turning on smartphone....");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
//        phone o=new phone();
//        smartphone t=new smartphone();
//        o.name();
        phone obj=new smartphone(); /*superclass reference can be equal to subclass reference but reverse is not true.here reference is of phone
         and object created is of smartphone.*/
        //smartphone obj1=new phone(); not allowed.
        obj.showTime();
        obj.on();
       //obj.music(); not allowed reference should be of the superclass not of the subclass.
        //only methods of superclass and overidden methods run.
    }
}

package com.company;
// Q4
interface tele
{
    void camera();
    void gps();
}
abstract class Telephone
{
   abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class smartTelephone extends Telephone implements tele
{
    void call()
    {
        System.out.println("calling....");
    }
    void ring()
    {
        System.out.println("the phone is ringing....");
    }
    void lift()
    {
        System.out.println("lift up the ringing phone...");
    }
    void disconnect()
    {
        System.out.println("Disconnect the phone after you have taken your call");
    }
    public void camera()
    {
        System.out.println("Camera is of 48mp");
    }
    public void gps()
    {
        System.out.println("turn on the gps of the phone if you have lost your way....");
    }
}
// Q3
class monkey
{
    void jump()
    {
        System.out.println("the monkey is jumping");
    }
    void bite()
    {
        System.out.println("the monkey is biting");
    }
}
interface basicanimal
{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal
{
    public void eat()
    {
        System.out.println("the person is eating");
    }
    public void sleep()
    {
        System.out.println("the person is going to sleep");
    }

}
// Q1+Q2
abstract class pen
{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen
{
    void ChangeNib()
    {
        System.out.println("Nib will get changed");
    }
    void write()
    {
        System.out.println("Write with this Fountain Pen");
    }
    void refill()
    {
        System.out.println("Refill This Fountain Pen");
    }
}
public class Practiceset_cwh_60 {
    public static void main(String[] args) {
        // Q1+Q2
    FountainPen obj=new FountainPen();
    obj.ChangeNib();
    obj.refill();
    obj.write();
    // Q3
        human ob=new human();
        ob.sleep();
        ob.eat();
        ob.jump();
        ob.bite();
    // Q4
        tele t=new smartTelephone();
        t.camera();
        t.gps();
//        t.call(); Not Allowed.
        smartTelephone T=new smartTelephone();
         T.ring();
         T.call();
         T.camera();
         T.gps();
         T.lift();
         T.disconnect();
    }
}

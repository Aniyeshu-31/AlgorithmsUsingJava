package com.company;
class A{
    public int a;
    public static void display()
    {
        System.out.println("parent class method display()");
    }
    public int ani(){
        return 4;
    }
    public void meth2()
    {
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override
   public  void meth2()
    {
        System.out.println("i am method 2 of class B"); // method overriding is done here
            }
    public void meth3()
    {
        System.out.println("i am method 3 of class B");
    }
//    public static void display()
//    {
//        System.out.println("display method of child class B");
//    }
}
public class method_overiding {
    public static void main(String[] args) {
        A a=new A();
//        B b=new B();
//        A obj=new B();
//        b.meth2();
//        a.meth2();
//        a.display();
//        b.display();

//        obj.meth2();
//        obj.display();
    }
}

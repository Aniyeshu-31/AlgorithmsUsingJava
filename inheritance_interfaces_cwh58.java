package com.company;
interface sample_interface
{
    void meth1();
    void meth2();
}
//class  sample_child_interface extends sample_interface  (Not allowed)
interface sample_child_interface extends sample_interface
{

    void meth3();
    void meth4();
}
class samplechild implements sample_child_interface
{
    @Override
    public void meth1() {
        System.out.println("Hello World");
    }

    @Override
    public void meth2() {
        System.out.println("Hi");
    }

    public void meth3()
    {
        System.out.println("I am Aniyeshu Verma");
    }
    public void meth4()
    {
        System.out.println("I study in IIIT Vadodara");
    }
}
public class inheritance_interfaces_cwh58 {
    public static void main(String[] args) {
     samplechild obj=new samplechild();
     obj.meth1();
     obj.meth2();
     obj.meth3();
     obj.meth4();
    }
}

package com.company;
class base1 {
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x)
    {
        System.out.println("i am an overloaded constructor with value of x is:"+x);
    }

}
class derived1 extends base1 {

    derived1() {
        //  super(123);
        System.out.println("i am a derived class constructor");// first baseclass constructor is invoked then followed by derived class constructor is invoked
    }

    derived1(int x, int y) {
        super(x);
        System.out.println("i am a derived class overloaded constructor with value of y is:" + y);// first baseclass constructor is invoked then followed by derived class constructor is invoked
    }
}
    class childclass extends derived1 {
        childclass() {
            System.out.println("i am child of derived class");
        }

        childclass(int a, int b, int c) {
            super(a, b);
            System.out.println("i am a child of derived:" + c);
        }
    }

    public class inheritance_constructors {
        public static void main(String[] args) {
            //base1 ob=new base1();
            //derived1 obj=new derived();
          //  derived1 obj1 = new derived1(4, 9);
            childclass cc=new childclass(12,13,14);

        }
    }





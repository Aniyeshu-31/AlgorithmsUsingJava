package com.company;
interface DemoAno
{
    void meth1(int a);
//    void meth2();
}
//class harry implements DemoAno
//{
//    public void meth1()
//    {
//        System.out.println("I am meth1");
//    }
//}
//class AnonyDemo implements DemoAno{
//    public void meth1()
//    {
//        System.out.println("meth1");
//    }
//    public void meth2()
//    {
//        System.out.println("meth2");
//    }
//    public void display()
//    {
//        System.out.println("Hello");
//    }
//}
public class cwh_109_Lambda {

    public static void main(String[] args) {
//       DemoAno obj=new AnonyDemo();
//       obj.meth1();
//       obj.meth2();
        // Anonymous class
//        DemoAno obj = new DemoAno() {
//
//
//            @Override
//            public void meth1() {
//                System.out.println("meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("meth2");
//            }
//
//        };
//        obj.meth1();
        // Lamda Expressions
//        DemoAno obj=new harry();
//        obj.meth1();
        DemoAno obj= (a)->{                            // Lamda Expressions
            System.out.println("I am meth1"+" : "+a);        // Lamda Expressions
        };
        obj.meth1(6);
    }
}

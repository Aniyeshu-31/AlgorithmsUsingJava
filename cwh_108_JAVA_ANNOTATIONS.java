package com.company;
//@FunctionalInterface
interface Myfunctionalinterface{

    void method1();
    void method2();

        }
class NewPhone extends phone{
    @Override
     public void showTime()
     {
         System.out.println("Time is 8 pm");
     }
     @Deprecated
    public int sum(int a , int b)
     {
         return (a+b);
     }
}
public class cwh_108_JAVA_ANNOTATIONS {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
      NewPhone p=new NewPhone();
      p.showTime();
      p.sum(5,6);
    }
}

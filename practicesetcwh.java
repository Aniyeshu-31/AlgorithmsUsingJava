package com.company;

import java.util.GregorianCalendar;

//problem2
class rectangle{
    int length,breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    rectangle()
    {

        System.out.println("the class rectangle has been created");
    }
    public double area(){
        return length*breadth;
    }
    public double peri(){
        return 2*(length+breadth);
    }
}
class cuboid extends rectangle{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    cuboid(){

        System.out.println("the class cuboid has been created which inherits class rectangle");
    }
    public double volume1()
    {
        return length*breadth*height;
    }
    public double area1()
    {
        return 2*(length*breadth+length*height+breadth*height);
    }

}
//problem 1
//class circle
//{
//    int r;
//    circle(int radius)
//    {
//        System.out.println("the class circle has been created ");
//        r=radius;
//    }
//    public double area()
//    {
//        return Math.PI*(this.r*this.r);
//    }
//}
//class cylinder1 extends circle{
//    public int height;
//    cylinder1(int r,int h){
//        super(r);
//        System.out.println("the another class has been created by inheriting class circle ");
//        this.height=h;
//    }
//    public double volume()
//    {
//        return Math.PI*(r*r)*this.height;
//    }
//}
public class practicesetcwh {
    public static void main(String[] args) {
//        cylinder1 c=new cylinder1(2,3);
//        double s=c.area();
//        double a=c.volume();
        cuboid ob=new cuboid();
        ob.setHeight(3);
        ob.setBreadth(2);
        ob.setLength(1);
        double v=ob.volume1();
        double a=ob.area1();
        double a1=ob.area();
        double v1=ob.peri() ;
        System.out.println(v+" "+a);
        System.out.println(v1+" "+a1);
//        System.out.println("area of circle:"+s);
//        System.out.println("volume of cylinder"+a);
    }
}

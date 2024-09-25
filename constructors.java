package com.company;
class vehicle{
    int wheels;
    int headlights;
    String color;
//    vehicle()
//    {
//        wheels=0;//default construtor or non parametrized constructor
//    }
    vehicle(int wheels)
    {
       this.wheels=wheels;
        headlights=2;
    }
    vehicle(int wheels,String color)
    {
        this.wheels=wheels;
        this.color=color;
        headlights=2;
    }

}

public class constructors {
    constructors()
    {
        System.out.println("object is now created");
    }
    public static void main(String args[])
    {
        constructors obj=new constructors();
        vehicle car=new vehicle(4,"red");
        vehicle scooty=new vehicle(2,"white");
      System.out.println(scooty.wheels+" "+scooty.color);
        System.out.println(car.wheels+" "+car.color);
    }
}

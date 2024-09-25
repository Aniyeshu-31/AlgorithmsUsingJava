package com.company;
class moto
{
moto()
{
    System.out.println("Hello I am a motorcycle, I am a cycle  with an engine");
}
}
class m extends moto
{
    m()
    {
        super();
        System.out.println("My ancestor is  a cycle who is a vehicle with pedals");
    }
}
public class hackerrank_overidden {
    public static void main(String[] args) {

       m m1=new m();

    }
}

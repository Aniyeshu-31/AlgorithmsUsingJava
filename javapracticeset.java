package com.company;


class cylinder{
    double radius,height,sa,volume,breadth,length;
    cylinder(double l,double b)
    {
        length=l;
        breadth=b;
    }
    cylinder()
    {
        length=0.0;
        breadth=0.0;
        radius=0.0;
        height=0.0;
        sa=0.0;
        volume=0.0;
    }
//    public void setRadiusheight(double r,double h)
//    {
//        radius=r;
//        height=h;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//    public double surfacearea()
//    {
//        sa=2*3.14*radius*height+2*3.14*(radius*radius);
//        return sa;
//    }
//    public double volume()
//    {
//       volume= 3.14*(radius*radius)*height;
//       return volume;
//    }
    public double perimeter()
    {
        double peri=2*(length+breadth);
        return peri;
    }
    public double area()
    {
        double area= length*breadth;
        return area;
    }

}
public class javapracticeset {
    public static void main(String[] args) {
        cylinder obj=new cylinder(12,34);
//        obj.setRadiusheight(3.0,3.0);
//        System.out.println(obj.getRadius()+" "+ obj.getHeight());
//        double v=obj.volume();
//        double s=obj.surfacearea();
          double q=obj.area();
          double w=obj.perimeter();
          System.out.println(w+" "+q);
//        System.out.println(s+" "+v);


    }
}

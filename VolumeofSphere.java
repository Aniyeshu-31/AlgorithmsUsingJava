package com.company;
import java.util.*;
public class VolumeofSphere {
    double r;
    VolumeofSphere(double r){
        this.r=r;
    }
     static double Volume(double r){
        return (4*Math.PI*(Math.pow(r,3)))/3;
    }
    public static void main(String[] args) {
       double r=0.0;
       Scanner sc=new Scanner(System.in);
        System.out.println("Input the Radius of the Sphere");
         r=sc.nextDouble();
       VolumeofSphere obj=new VolumeofSphere(r);
        System.out.println(Volume(obj.r));
    }
}

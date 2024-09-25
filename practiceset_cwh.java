package com.company;
//problem4:
class tommyvercetti{
    public void hit()
    {
        System.out.println("hitting the enemy");
    }
    public void running()
    {
        System.out.println("running from the enemy");
    }
    public void firing()
    {
        System.out.println("firing on the enenmy");
    }
}
//problem3:
//class square{
//    double side;
//    public void intialize(double s)
//    {
//        side=s;
//    }
//    public double calc()
//    {
//        double peri= 4*side;
//        return peri;
//    }
//    public double calc1()
//    {
//        double area=side*side;
//        return area;
//    }
//
//}
//problem2:
//class cellphone{
//    public void ringing()
//    {
//        System.out.println("phone is ringing");
//    }
//    public void vibrating()
//    {
//        System.out.println("phone is vibrating");
//    }
//}
//problem1:
//class practice{
//    int salary;
//    String name;
//    public int getsalary()
//    {
//        return salary;
//    }
//    public String getname()
//    {
//        return name;
//    }
//    public void changename(String n)
//    {
//        name=n;
//        System.out.println(name);
//    }
//}
public class practiceset_cwh {
    public static void main(String[] args) {
        tommyvercetti player=new tommyvercetti();
        player.hit();
        player.running();
        player.firing();
//        square obj2=new square();
//         obj2.intialize(3);
//        System.out.println("perimeter: "+obj2.calc());
//        System.out.println("area:"+obj2.calc1());

//        cellphone obj1=new cellphone();
//       practice obj=new practice();
//       obj.salary=34000;
//       obj.name="Aniyeshu";
//       obj.changename("harry");
//
//        System.out.println(obj.getname()+"\n"+obj.getsalary());
//        obj1.ringing();
//        obj1.vibrating();
    }
}

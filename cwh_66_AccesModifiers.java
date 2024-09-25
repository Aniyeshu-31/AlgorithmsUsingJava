package com.company;
class c1{
    public int x=5;
    protected int y=45;
    int z=6;
    private int d=34;
    public void meth()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(d);
        System.out.println(z);
    }
}
public class cwh_66_AccesModifiers {
    public static void main(String[] args) {
        c1 c=new c1();
        //c.meth();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.d);   It has private access.
    }
}
// Access Modifiers     Class   Package   subclass  World
//    Public              Y       Y          Y         Y
//    Protected           Y       Y          Y         N
//    Default(no)         Y       Y          N         N
//    Private             Y       N          N         N
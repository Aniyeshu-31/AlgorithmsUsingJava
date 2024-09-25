package com.company;

class ekclass{
    int a;

    public int getA() {
        return a;
    }

    ekclass(int a)
    {
      this.a=a;
    }
    public int returnone()
    {
        return 1;
    }

}
class doclass extends ekclass{
 doclass(int c)
 {
     super(c);
     System.out.println("i am a constructor");
 }
 public void call()
 {
     super.a=6;
     int v=super.a;
     System.out.println(super.returnone()+" "+","+v); // referring the parent class instance variable;
 }
}

public class this_superkeywords {
    public static void main(String[] args) {
        ekclass ec=new ekclass(79);
        System.out.println(ec.getA());
        doclass d=new doclass(134);
        d.call();//invoking the parent class method;
    }
}
// can used to refer immediate parent class instance variable.
// can used to refer the method in the parent class.
// cam used to make parent class constructor.
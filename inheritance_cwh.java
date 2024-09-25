package com.company;

class base {
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base and setting x now");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a constructor");
    }
}
    class derived extends base{
        int y;
        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    //inheritance is done

public class inheritance_cwh {
    public static void main(String[] args) {
//        base b=new base();
//        b.setX(43);
//        System.out.println(b.getX());
      derived d=new derived();
      derived b=new derived();
        d.setY(34);
        System.out.println(d.getY());
       d.setX(90);
        System.out.println(d.getX());


    }
}
//java does not support multiple inheritance
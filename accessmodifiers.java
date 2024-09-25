package com.company;

class MyEmployee {
    private int id;
    private String name;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
       this.id = i;
    }
}
public class accessmodifiers {
    public static void main(String[] args) {
        MyEmployee ob=new MyEmployee();
        ob.setname("aniyeshu");
        ob.setId(21302);
        System.out.println(ob.getname());
        System.out.println(ob.getId());
    }
}

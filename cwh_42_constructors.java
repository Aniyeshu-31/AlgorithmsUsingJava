package com.company;

class MyMainEmployee {
    private int id;
    private String name;
    public MyMainEmployee(){
        id=23;
        name="Aniyeshu";
    }

    public MyMainEmployee(String Myname,int n)
    {
        id=n;
        name=Myname;
    }
    public String getname() {
        return name;
    }
    public void setname(String n) {
        this.name = n;
    }
    public int getId() {
        return id;
    }
    public void setId(int i)
    {
        this.id = i;
    }
}
public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee obj = new MyMainEmployee("Aniyeshu31052003",12344);
        MyMainEmployee obj1= new MyMainEmployee();// As soon As the object of the class is created automatically the constructor is invoked.
//        obj.setname("AniyeshuVerma");
//        obj.setId(34);
        System.out.println(obj.getname());
        System.out.println(obj.getId());
        System.out.println(obj1.getname());
        System.out.println(obj1.getId());
    }
}
//Constructor overloading is done
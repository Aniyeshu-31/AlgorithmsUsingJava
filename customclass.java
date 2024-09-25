package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public int getsalary()
    {
        return salary;
    }
    public void printdetails()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
    }
}
public class customclass {
    public static void main(String[] args) {
        System.out.println("this is out custom class");
        Employee obj=new Employee();
        obj.salary=43000;
        int salary=obj.getsalary();
        obj.id=21;
        obj.name="Aniyeshu";
        obj.printdetails();
        System.out.println(salary);
    }
}

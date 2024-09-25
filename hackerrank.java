package com.company;
class sports
{
    String getname()
    {
        return "Generic Sports";
    }
    void getNumberofTeamMembers()
    {
        System.out.println("Each team has n players in"+" "+getname());
    }
}
class Soccer extends sports
{
    String getname()
    {
        return "Soccer Class";
    }
    void getNumberofTeamMembers()
    {
        System.out.println("Each team has 11 players in"+" "+getname());
    }

}
public class hackerrank {
    public static void main(String[] args) {
          Soccer s= new Soccer();
          sports ob=new sports();
        System.out.println(ob.getname());
          ob.getNumberofTeamMembers();
        System.out.println(s.getname());
          s.getNumberofTeamMembers();

    }
}

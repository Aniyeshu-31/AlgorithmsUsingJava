package com.company;
import java.util.*;
abstract class book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}
class another extends book
{
    @Override
    void setTitle(String s)
    {
          title=s;
    }

}
public class abstractclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      another obj=new another();
      obj.title=sc.nextLine();
      obj.setTitle(obj.title);
        System.out.println("The title is:"+" "+obj.getTitle());
    }
}

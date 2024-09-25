package com.company;
import java.util.Random;
import java.util.*;
class games

{

    public int  inputnum;
    public int number;
    public int noofguesses;
    games()
    {
        Random ran=new Random();
         this.number=ran.nextInt(100);
    }
    public int getNoofguesses() {
        return noofguesses;
    }
    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }
    void takeinput()
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("input the number");
     this.inputnum=sc.nextInt();
    }
    boolean isCorrectNumber()
    {
        if(inputnum==number) {
            System.out.println("you guessed it right");
            return true;
        }
        else if(inputnum>number)
        {
            System.out.println("select lower number");
        }
        else if(inputnum<number)
        {
            System.out.println("select higher number");
        }
            return false;
    }
}
public class Game {

    public static void main(String[] args) {
        games g = new games();
        int a=0;
        boolean b = false;
        while (!b) {

            g.takeinput();
            b= g.isCorrectNumber();
            System.out.println(b);
            a++;
        }
        g.setNoofguesses(a);
        System.out.println(g.getNoofguesses());


    }
}

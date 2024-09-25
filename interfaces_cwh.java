package com.company;
interface bicycle   //interface has all methods abstract
{
    int a=90;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface horn
{
    void blowhorn();
}
class  avon implements bicycle,horn
{
    int speed=7;
    @Override
    public void applybrake(int decrement) {
        speed = speed - decrement;
        System.out.println(speed);
    }
        public void blowhorn()
        {
            System.out.println("pe pe pe pe");

        }
        @Override
    public void speedup(int increment)
        {
        speed= speed+increment;
        System.out.println(speed);
        }
}



    public class interfaces_cwh {
    public static void main(String[] args) {
     avon cycle=new avon();
     cycle.applybrake(3);
     // cycle.a=89; cannot modify any thing in the interface it is final
        System.out.println(cycle.a);
       cycle.blowhorn();
    }
}
// Interface methods are made always public
// we can create property in Interface
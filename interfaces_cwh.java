interface vehicle   //interface has all methods abstract
{
    int a=90;
    void applybrake(int decrement);
    void speedup(int increment);
    void numberofTyres();
}
interface horn
{
    void blowhorn();
}
class avon implements vehicle,horn
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
        @Override
        public void numberofTyres() {
            System.out.println(2);
        }
}



    public class interfaces_cwh {
    public static void main(String[] args) {
     vehicle cycle=new avon();
     cycle.applybrake(3);
     // cycle.a=89; cannot modify any thing in the interface it is final
        System.out.println(cycle.a);
       cycle.speedup(2);
       cycle.numberofTyres();
    }
}
// Interface methods are made always public
// we can create property in Interface
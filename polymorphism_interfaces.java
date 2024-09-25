package com.company;
interface camera1
{
    void takingsnap();
    void recordvideo();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void record4Kvideo()
    {
        greet();
        System.out.println("recording 4k video");
    }
}
interface wifi1
{
    String[] getnetworks();
    void connectToNetwork(String network);

}
class cellphone1
{
    void call(int phoneNo)
    {
        System.out.println("call Number"+phoneNo);
    }
    void pickcall()
    {
        System.out.println("connecting...");
    }

}
class Mysmartphone1 extends cellphone1 implements wifi1 , camera1 {
    public void takingsnap() {
        System.out.println("Taking snap");
    }

    public void recordvideo() {
        System.out.println("Recording the video");
    }

    public String[] getnetworks() {
        String[] networklist = {"Aniyeshu31", "RockingStars", "Chhota Bheem"};
        return networklist;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting..." + network);
    }
    public void Samplemeth()
    {
        System.out.println("Sample Method");
    }
}
    public class polymorphism_interfaces {
        public static void main(String[] args) {
            camera1 c1=new Mysmartphone1(); // Reference of interface and object of class. camer1 is interface and Mysmartphone1 is a class
            c1.takingsnap();
            c1.record4Kvideo();
            c1.recordvideo();
            // c1.getnetworks(); Not Allowed;
            // c1.Samplemeth();  Not Allowed;
            Mysmartphone1 s=new Mysmartphone1();
            s.connectToNetwork("Aniyeshu3105");
            s.Samplemeth();
            s.recordvideo();
            s.takingsnap();
            s.pickcall();
            String a[]= s.getnetworks();
            for(String ele: a)
            {
                System.out.println(ele);
            }

        }
    }




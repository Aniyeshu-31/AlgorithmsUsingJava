package com.company;
interface camera
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
interface wifi
{
    String[] getnetworks();
    void connectToNetwork(String network);

}
class cellphone
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
class Mysmartphone extends cellphone implements wifi , camera
{
    public void takingsnap()
    {
        System.out.println("Taking snap");
    }
    public void recordvideo()
    {
        System.out.println("Recording the video");
    }
    public String[] getnetworks()
    {
      String[]  networklist={"Aniyeshu31" , "RockingStars" , "Chhota Bheem"};
      return networklist;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting..."+network);
    }
//    public void record4Kvideo()
//    {
//        System.out.println("4k video"); overwritten methods are run always
//    }
}
public class cwh_57_defaultmethods {
    public static void main(String[] args) {
        Mysmartphone ms=new Mysmartphone();
        String ar[]= ms.getnetworks();
        ms.record4Kvideo();
//        ms.greet(); throws an error.
        for(String elements:ar)
        {
            System.out.println(elements);
        }
    }
}
// Interfaces can also used private methods for default methods for use of default methods.
import java.lang.Thread;
public class Main {
    public static void main(String[] args) {
        // WorkInter workInter = ()->{
        // System.out.println("I am Doing Task");
        // };
        // workInter.doTask();
        // WorkInter obj = new WorkInter() {
        // @Override
        // public void doTask() {
        // System.out.println("I am Doing Task");
        // }
        // };
        System.out.println(Thread.currentThread().getName()); //Main function is also a THREAD
        // referring static method
        WorkInter workInter = Stuff::doStuff;
        workInter.doTask();

        // Runnable runnable = Stuff::threadMethod;
        // Thread obj = new Thread(runnable);
        // obj.start();
        Stuff ob = new Stuff();
        Runnable run1 = ob::printHundred;
        Thread thread2 = new Thread(run1);
        thread2.start();
    }
}

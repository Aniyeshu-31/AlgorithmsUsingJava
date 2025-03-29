public class Stuff {
    public static void doStuff() {
        System.out.println("I am Doing Task");
    }
    public static void threadMethod() {
        for(int i = 1;i <= 10;i++){
            System.out.println(i * 2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printHundred() {
        for(int i = 1;i <= 10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

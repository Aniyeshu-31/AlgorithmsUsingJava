package com.company;
class Thre1 extends Thread {
    static int maxi1;

    public int getMaxi1() {
        int i = 0, max = 0, count = 0, num = 0,num1=0;
        for (i = 1; i <= 2500; i++) {
            count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
           if(count>maxi1)
           {
               num1=i;
           }
            max = Math.max(count, max);
        }
        maxi1=num1;
        return maxi1;
    }


    public void run() {
        getMaxi1();
    }
}
    class Thre2 extends Thread {
        static int maxi2;

        public int getMaxi2() {
            int i = 0, max = 0, count = 0;
            int num = 0,num1=0;
            for (i = 2501; i < 5000; i++) {
                count = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
               if(count>maxi2){
                   num1=i;
               }
                max = Math.max(count, max);
            }
            maxi2=num1;

            return maxi2;
        }

        public void run() {
            getMaxi2();
        }
    }

  class Thre3 extends Thread {
        static int maxi3;

        public int getMaxi3() {
            int i = 0, max = 0, count = 0;
            int num = 0,num1=0;
            for (i = 5001; i <= 7500; i++) {
                count = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                if(count>maxi3){
                    num1=i;
                }
                max = Math.max(count, max);
            }
            maxi3=num1;
            return maxi3;
        }

        public void run() {
            getMaxi3();
        }
    }

class Thre4 extends Thread {
        public int maxi4;

        public int getMaxi4() {
            int i = 0, max = 0, count = 0;
            int num = 0,num1=0;
            for (i = 7501; i <= 10000; i++) {
                count = 0;
                for (int j = 1; j < i; j++) {
                    if (i%j == 0) {
                        count++;
                    }
                }

                if(count>max){
                    num1=i;
                }
                max = Math.max(count, max);
            }
            maxi4=num1;
            return maxi4;
        }

        public void run() {
            getMaxi4();
        }
    }

    public class Threads extends Thread {

        public static void main(String[] args) {
            Thre1 obj = new Thre1();
            Thre2 obj1 = new Thre2();
            Thre3 obj2 = new Thre3();
            Thre4 obj3 = new Thre4();
            obj.start();
            obj1.start();
            obj2.start();
            obj3.start();
//            int max1=Math.max(obj.getMaxi1(),obj1.getMaxi2());
//            int max2=Math.max(obj2.getMaxi3(),obj3.getMaxi4());
//            System.out.println("the number with maximum divisors is:-");
//            System.out.println(Math.max(max1,max2));
            System.out.println(obj.getMaxi1());
            System.out.println(obj1.getMaxi2());
            System.out.println(obj2.getMaxi3());
            System.out.println(obj3.getMaxi4());
        }
    }


package com.company;

public class maximum {
    public static void main(String[] args) {
        int max=0,count=0,num=0;
        for(int i=1;i<=10000;i++){
            count=0;
            for(int j=1;j<=i;j++) {
                if (j % i == 0) {
                    count++;
                }
            }
            max=Math.max(max,count);
            num=i;
        }
        System.out.println(num);
    }
}

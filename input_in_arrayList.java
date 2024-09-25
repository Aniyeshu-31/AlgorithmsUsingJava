package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class input_in_arrayList {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n ,i=0;

            ArrayList<Integer> arr=new ArrayList<>(5);

            while(i<5)
            {
                arr.add(sc.nextInt());
                i++;
            }
            System.out.print(arr);
        }
    }



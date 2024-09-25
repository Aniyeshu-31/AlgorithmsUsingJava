package com.company;

import java.util.Random;
import java.util.Scanner;

public class rockpaperscissiorgame {
    public static void main(String[] args) {
        //0-rock
        //1-paper
        //2-scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("input your choice from 0-rock,1-paper,2-scissor");
        int input_user = sc.nextInt();
        Random ran = new Random();
        int input_computer = ran.nextInt(3);
        if ((input_user == 0 && input_computer == 2) || (input_user == 2 && input_computer == 1) || (input_user == 1 && input_computer == 0)) {
            System.out.println("YOU WIN!!");
        } else if (input_user == input_computer) {
            System.out.println("GAME DRAW!!");
        } else {
            System.out.println("COMPUTER WIN!!");
        }
        System.out.println("computerInput:" + input_computer);

    }
}


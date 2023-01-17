package com.hus.homework2;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        int SECRET_NUMBER = (int) (Math.random() * 100);
        Scanner in = new Scanner(System.in);
        runGame(in, SECRET_NUMBER);
    }
    public static void runGame(Scanner in, int secretNumber) {
        System.out.println("Key in your guess:");
        int trials = 0;
        while (true) {
            int trialNumber = in.nextInt();
            trials++;
            if (secretNumber == trialNumber) {
                System.out.printf("You got it in %d trials!\n", trials);
                break;
            } else if (secretNumber > trialNumber) {
                System.out.printf("Try higher\n");
            } else if (secretNumber < trialNumber) {
                System.out.printf("Try lower\n");
            }
        }
    }
}
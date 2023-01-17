package com.hus.homework1;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void getCode(char inChar) {
        if (inChar <= 'Z' && inChar >= 'D') {
            System.out.print((char) (inChar - 3));
        } else if (inChar == 'A') {
            System.out.print('X');
        } else if (inChar == 'B') {
            System.out.print('Y');
        } else if (inChar == 'C') {
            System.out.print('Y');
        } else {
            System.err.println("Error!!!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a ciphertext string: ");
        Scanner in = new Scanner(System.in);
        String inStr = in.next().toUpperCase();
        System.out.print("The plaintext string is: ");
        for (int idxChr = 0; idxChr < inStr.length(); idxChr++) {
            getCode(inStr.charAt(idxChr));
        }
        System.out.println();
    }
}



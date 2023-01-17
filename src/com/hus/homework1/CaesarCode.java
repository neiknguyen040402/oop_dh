package com.hus.homework1;

import java.util.Scanner;

public class CaesarCode {
    public static void getCode(char inChar) {
        if (inChar <= 'W' && inChar >= 'A') {
            System.out.print((char) (inChar + 3));
        } else if (inChar == 'X') {
            System.out.print('A');
        } else if (inChar == 'Y') {
            System.out.print('B');
        } else if (inChar == 'Z') {
            System.out.print('C');
        } else {
            System.err.println("Error!!!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a plaintext string: ");
        Scanner in = new Scanner(System.in);
        String inStr = in.next().toUpperCase();
        System.out.print("The ciphertext string is: ");
        for (int idxChr = 0; idxChr < inStr.length(); idxChr++) {
            getCode(inStr.charAt(idxChr));
        }
        System.out.println();
    }
}

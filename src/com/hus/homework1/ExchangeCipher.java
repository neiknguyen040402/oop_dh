package com.hus.homework1;

import java.util.Scanner;

public class ExchangeCipher {
    public static void getCode(char inChar) {
        System.out.print((char) ('A' + 'Z' - inChar));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String inStr = in.next().toUpperCase();
        System.out.print("The ciphertext string is: ");
        for (int idxChr = 0; idxChr < inStr.length(); idxChr++) {
            getCode(inStr.charAt(idxChr));
        }
        System.out.println();
    }
}

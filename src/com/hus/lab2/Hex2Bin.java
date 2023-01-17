package com.hus.lab2;

import java.util.Scanner;

public class Hex2Bin {
    public static final String[] HEX_BITS = {"0000",
            "0001", "0010", "0011", "0100", "0101",
            "0110", "0111", "1000", "1001", "1010",
            "1011", "1100", "1101", "1110", "1111"};

    public static boolean isHex(String inStr) {
        for (int charInd = 0; charInd < inStr.length(); charInd++) {
            if (Character.digit(inStr.toLowerCase().charAt(charInd), 16) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal String: ");
        String inStr = in.next();
        if (isHex(inStr)) {
            System.out.print("The equidvalent binary for hexadecimal \"" + inStr + "\" is: ");
            for (int idx = 0; idx < inStr.length(); idx++) {
                int j = Character.digit(inStr.toLowerCase().charAt(idx), 16);
                System.out.printf("%1$s ", HEX_BITS[j]);
            }
        } else {
            System.out.println("Error: Input hexadecimal number format is incorrect!!!");
        }
    }
}


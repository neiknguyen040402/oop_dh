package com.hus.homework1;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void getNumber(char inChar) {
        switch (inChar) {
            case 'a':
            case 'b':
            case 'c':
                System.out.print(2);
                break;
            case 'd':
            case 'e':
            case 'f':
                System.out.print(3);
                break;
            case 'g':
            case 'h':
            case 'i':
                System.out.print(4);
                break;
            case 'j':
            case 'k':
            case 'l':
                System.out.print(5);
                break;
            case 'm':
            case 'n':
            case 'o':
                System.out.print(6);
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                System.out.print(7);
                break;
            case 't':
            case 'u':
            case 'v':
                System.out.print(8);
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.print(9);
                break;
            default:
                System.err.print(" Error !!!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String stringVal = in.next().toLowerCase();
        for (int idxChr = 0; idxChr < stringVal.length(); idxChr++) {
            getNumber(stringVal.charAt(idxChr));
        }
        System.out.println();
    }
}

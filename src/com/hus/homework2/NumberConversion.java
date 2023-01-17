package com.hus.homework2;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String inString = in.next();
        System.out.print("Enter the input radix: ");
        int inRadix = in.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = in.nextInt();
        System.out.println("\"" + inString + "\"" + " in radix " + inRadix + " is \""
                + toRadix(inString, inRadix, outRadix) + "\" in radix " + outRadix);
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        return Integer.toString(Integer.parseInt(in, inRadix), outRadix);
    }
}

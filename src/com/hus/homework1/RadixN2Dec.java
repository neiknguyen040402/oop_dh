package com.hus.homework1;

import java.util.Scanner;

public class RadixN2Dec {
    public static int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for (int i = numbers.length - 1; i >= 0; i--)
            if (numbers[i] == '1')
                result += Math.pow(2, (numbers.length - i - 1));
        return result;
    }

    public static boolean checkDec(String inStr) {
        int count = 0;
        for (int idxChr = 0; idxChr < inStr.length(); idxChr++) {
            if (!(inStr.charAt(idxChr) >= '0' && inStr.charAt(idxChr) <= '7')) {
                count++;
            }
        }
        if (count != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkHex(String inStr) {
        int count = 0;
        for (int idxChr = 0; idxChr < inStr.length(); idxChr++) {
            if (!((inStr.charAt(idxChr) >= '0' && inStr.charAt(idxChr) <= '9') ||
                    (inStr.charAt(idxChr) >= 'A' && inStr.charAt(idxChr) <= 'F') ||
                    (inStr.charAt(idxChr) >= 'a' && inStr.charAt(idxChr) <= 'f'))) {
                count++;
            }
        }
        if (count != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = scanner.nextInt();
        System.out.print("Enter the string: ");
        String inStr = scanner.next();
        if (radix == 2) {
            int count = 0;
            for (int idxChr = 0; idxChr < inStr.length(); idxChr++) {
                if (inStr.charAt(idxChr) != '0' && inStr.charAt(idxChr) != '1') {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print("The equivalent decimal number" + inStr + " is : " + binaryToInteger(inStr));
            }
        } else if (radix == 8) {
            if (checkDec(inStr)) {
                int num = Integer.parseInt(inStr, 8);
                System.out.print("The equivalent decimal number" + inStr + " is : " + num);
            }
        } else if (radix == 16) {
            if (checkHex(inStr)) {
                int num = Integer.parseInt(inStr, 16);
                System.out.print("The equivalent decimal number" + inStr + " is : " + num);
            }
        } else {
            System.out.println("error!!!");
        }
    }
}

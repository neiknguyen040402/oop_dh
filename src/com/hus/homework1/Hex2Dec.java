package com.hus.homework1;

import java.util.Scanner;

public class Hex2Dec {
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
        System.out.print("Enter a Hexadecimal string: ");
        String hexnum = scanner.nextLine();
        if (checkHex(hexnum)) {
            int num = Integer.parseInt(hexnum, 16);
            System.out.println("The equivalent number for hexadecimal " + "\"" + hexnum + "\" is: " + num);
        } else {
            System.out.println("error: invalid hexadecimal string " + "\"" + hexnum + "\"");
        }
    }
}

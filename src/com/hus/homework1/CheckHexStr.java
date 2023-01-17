package com.hus.homework1;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = in.next();
        int count = 0;
        for (int idxChr = 0; idxChr < inStr.length(); idxChr++) {
            if (!((inStr.charAt(idxChr) >= '0' && inStr.charAt(idxChr) <= '9') ||
                    (inStr.charAt(idxChr) >= 'A' && inStr.charAt(idxChr) <= 'F') ||
                    (inStr.charAt(idxChr) >= 'a' && inStr.charAt(idxChr) <= 'f'))) {
                count++;
            }
        }
        if (count != 0) {
            System.out.print("\"" + inStr + "\"");
            System.out.println(" is NOT a hex string");
        } else {
            System.out.print("\"" + inStr + "\"");
            System.out.println(" is a hex string");
        }
    }
}

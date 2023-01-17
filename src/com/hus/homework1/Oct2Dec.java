package com.hus.homework1;

import java.util.Scanner;

public class Oct2Dec {
    public static boolean checkDec(int inNum) {
        int count = 0;
        while (inNum > 0) {
            int surplus = inNum % 10;
            if (!(surplus >= 0 && surplus <= 7)) {
                count++;
            }
            inNum /= 10;
        }
        if (count != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        int dexnum = scanner.nextInt();
        int dex = dexnum;
        if (checkDec(dexnum)) {
            int num = 0;
            int count = 0;
            while (true) {
                if (dexnum == 0) {
                    break;
                } else {
                    int temp = dexnum % 10;
                    num += temp * Math.pow(8, count);
                    dexnum /= 10;
                    count++;
                }
            }
            System.out.println("The equivalent decimal number " + "\"" + dex + "\" is: " + num);
        } else {
            System.out.println("error: invalid decimal string " + "\"" + dex + "\"");
        }
    }
}


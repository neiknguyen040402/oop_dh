package com.hus.homework1;

import java.util.Scanner;

public class Bin2Dec {
    public static int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for (int i = numbers.length - 1; i >= 0; i--)
            if (numbers[i] == '1')
                result += Math.pow(2, (numbers.length - i - 1));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String inNum = sc.next();
        int count = 0;
        for (int idxChr = 0; idxChr < inNum.length(); idxChr++) {
            if (inNum.charAt(idxChr) != '0' && inNum.charAt(idxChr) != '1') {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The equivalent decimal number for binary " + "\"" + inNum + "\" is: "
                    + binaryToInteger(inNum));
        } else {
            System.out.println("error : invalid binary string " + "\"" + inNum + "\"");
        }
    }
}


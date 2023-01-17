package com.hus.lab2;

import java.util.Scanner;

public class Dec2Hex {
	public static String toHex(int decimal) {
		int temp;
		String hex = "";
		char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		while (decimal > 0) {
			temp = decimal % 16;
			hex = hexChar[temp] + hex;
			decimal = decimal / 16;
		}
		return hex;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int decimal = in.nextInt();
		in.close();
		System.out.println("Enter a decimal number: " + decimal);
		System.out.printf("The equidvalent hexadecimal number is %1$s", toHex(decimal));
	}
}

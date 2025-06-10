package com.problemSolving;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int number = sc.nextInt();
		int temp = number;
		int count = 0;
		// counting digits
		while (temp != 0) {
			count++;
			temp = temp / 10;
		}
		temp = number;
		int sum = 0;
		// sum of digits
		while (temp != 0) {
			int digit = temp % 10;
			int power = 1;
			for (int i = 1; i <= count; i++) {
				power *= digit;
			}
			sum += power;
			temp /= 10;

		}
		String result = (sum == number) ? number + " " + "is an Armstrong Number"
				: number + " " + "is not an Armstrong Number";
		System.out.println(result);
		sc.close();
	}
}

package com.problemSolving;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int number = sc.nextInt();
		int sum = 0;
		int temp = number;
		while (number != 0) {
			int fact = 1;
			int digit = number % 10;
			for (int i = 1; i <= digit; i++) {
				fact *= i;
			}
			sum += fact;
			number /= 10;
		}

		String result = (temp == sum) ? temp + " " + "is a Strong Number" : temp + " " + "is not a Strong number";
		System.out.println(result);
	}
}

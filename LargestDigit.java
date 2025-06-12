package com.problemSolving;
import java.util.Scanner;

public class LargestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int number= sc.nextInt();
		int max=0;
		
		while(number!=0) {
			int digit = number%10;
			if(digit>max) {
				max=digit;
			}
		
			number/=10;	
		}
		System.out.println("Largest digit is:" + max);
	}

}

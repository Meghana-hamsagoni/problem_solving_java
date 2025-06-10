package com.problemSolving;
import java.util.Scanner;

public class PrimeDigits {
	public static boolean isPrime( int input) {
		if (input<=1) {
			return false;
		}
		for(int i=2; i<=input/2;i++) {
			if(input%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int number= sc.nextInt();
		while(number!=0) {
			int digit= number%10;
			if(isPrime(digit)) {
				System.out.print(digit + " ");
			}
			number/=10;	
		}
	}

}

package com.problemSolving;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int input= sc.nextInt();
		if (input <=1) {
			System.out.println(input);
		}
		else {
			boolean isPrime=true;
		    for(int i=2;i<=input/2;i++) {
			if(input%i ==0) {
				isPrime=false;
				break;
			}
		    }
			if (isPrime) {
				System.out.println(input + " " + "is a prime number");
			}
			else {
				System.out.println(input + " " + "is not a prime number");
				
			}
		}
	}

}

package com.problemSolving;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int reverse=0;
		System.out.println("Enter any Number");
		int number= sc.nextInt();
		int temp=number;
		while(number!=0) {
		reverse=  reverse * 10 + number % 10 ;
		number=number/ 10;
	}
		String result= (reverse==temp)?"palindrome Number" : "Not a palindrome number";
		System.out.println(result);
	}
}

package com.problemSolving;
import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int number= sc.nextInt();
		int temp=number;
		int sum=0;
		while(number!=0) {
		sum= sum + number%10;
		number=number/10;
		}
		String result= ((temp%sum)==0)?"Harshad Number":"Not a Harshad Number";
		System.out.println(result);
	}

}

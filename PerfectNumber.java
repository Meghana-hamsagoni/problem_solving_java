package com.problemSolving;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int number= sc.nextInt();
		int sum =0;
			for(int i=1;i<=number/2;i++) {
				if (number % i==0) {
					sum+=i;	
				}
			}
		
		String result = (number==sum)?"Perfect Number": "Not a Perfect Number";
		System.out.println(result);
	}

}

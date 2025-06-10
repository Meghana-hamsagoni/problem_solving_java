package com.problemSolving;
import java.util.Scanner;

public class PerfectSquare {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any number");
			int number= sc.nextInt();
				for( int i=1; i*i<=number;i++) {
					if(number==i*i) {
					System.out.println( number + " " +"is a perfect Square number");
					return;
				}
				}
				System.out.println(number + " " + "is not a perfect square number");
		}
	}

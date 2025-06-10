package com.problemSolving;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n =10;
		int firstTerm=0;
		int secondTerm=1;
		System.out.print("Fibonacci Series upto" +" " + n +" " +"are" + " ");
		for(int i=1;i<=n;i+=1) {
			System.out.print( firstTerm + " ");
		
		int next= firstTerm + secondTerm;
		firstTerm=secondTerm;
		secondTerm=next;
		}	
	}

}

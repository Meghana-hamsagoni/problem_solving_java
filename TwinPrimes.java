package com.problemSolving;

public class TwinPrimes {
	public static boolean isPrime(int number) {
		if(number<=1) 
			return false;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) { 
				return false;
			}
		}
				return true;
			}
		public static void findTwinPrimes(int max) {
			for(int i=2;i<=max-2;i++) {
				if(isPrime (i) && isPrime(i+2)) {
					System.out.println(i + " " + (i+2) + " ");
				}
			}
		}
		public  static void main(String [] args) {
			int max=100;
			System.out.println("Twin primes upto" + " "+ max + " "+ "are");
			TwinPrimes.findTwinPrimes(100);
		}
	}

			
		

	
	
		

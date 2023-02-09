package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What is the upper range of numbers you want to find the primes of?");
		int n = in.nextInt();

		boolean [] prime = new boolean [n+1];

		// set to true

		for (int i=0; i<prime.length; i++) {
			prime[i] = true; }

		// for the length of the thingamabob, starting at 2 screen for primes

		for (int i = 2; i <= java.lang.Math.sqrt(n); i++) {

			if(prime[i]=true) { 


				for ( int j = i*i; j < prime.length; j+=i) {
					prime[j] = false;
				}
			}

			for (i=2; i<prime.length; i++) {	
				if (prime[i])
					
					System.out.println(i);
		}

	}
	} }

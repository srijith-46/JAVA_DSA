package dsa;

import java.util.Scanner;

public class Divisors {
	
	static void printDivisors(int n ){
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDivisors(n);
		sc.close();
	}

}

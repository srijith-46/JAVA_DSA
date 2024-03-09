package dsa;

import java.util.Scanner;

public class Lcm {

	static int lcm(int a, int b) {
		int result = Math.max(a, b);

		while (true) {
			if (result % a == 0 && result % b == 0) {
				break;
			}     
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(lcm(a, b));
		sc.close();
	}

}

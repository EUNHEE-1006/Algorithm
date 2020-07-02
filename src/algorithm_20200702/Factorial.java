package algorithm_20200702;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int x) {
		if(x>0) {
			return x*factorial(x-1);
		}else {
			return 1;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int result = factorial(stdIn.nextInt());
	}

}

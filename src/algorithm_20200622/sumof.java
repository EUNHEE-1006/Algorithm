package algorithm_20200622;

import java.util.Scanner;

public class sumof {
	static int sumof(int a, int b) {
		int total =0;
		int i =a;
		while(i<=b) {
			total +=i;
			i++;
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = stdIn.nextInt();
		System.out.println("숫자를 입력하세요");
		int b = stdIn.nextInt();
		int result = sumof(a, b);
		System.out.println("a부터 b까지의 합은 " + result);
		
	}
}

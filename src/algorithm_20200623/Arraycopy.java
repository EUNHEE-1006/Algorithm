package algorithm_20200623;

import java.util.Scanner;

public class Arraycopy {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 숫자를 입력하실건가요?");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		copy(a, b);
		for(int value : b) {
			System.out.print(value);
		}
	}

}

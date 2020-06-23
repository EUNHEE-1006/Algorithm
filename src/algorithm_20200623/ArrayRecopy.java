package algorithm_20200623;

import java.util.Scanner;

public class ArrayRecopy {
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i]=b[b.length-(i+1)];
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("몇 개의 숫자를 입력하실건가요?");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = stdIn.nextInt();
		}
		rcopy(a, b);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

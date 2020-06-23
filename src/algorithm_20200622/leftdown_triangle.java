package algorithm_20200622;

import java.util.Scanner;

public class leftdown_triangle {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("직각 이등변 삼각형을 출력합니다.");
		int num = stdIn.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package Algorithm_20200622;

import java.util.Scanner;

public class rightdown_triangle {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("직각 이등변 삼각형을 출력합니다.");
		int num = stdIn.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <=i ; j2++) {
				System.out.print("*");
			}			
			
			System.out.println();
		}
	}
}

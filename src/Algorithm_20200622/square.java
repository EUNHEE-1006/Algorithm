package Algorithm_20200622;

import java.util.Scanner;

public class square {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단수 : ");
		int num = stdIn.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}

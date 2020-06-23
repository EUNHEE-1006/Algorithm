package algorithm_20200622;

import java.util.Scanner;

public class pyramid {
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (i-1)*2+1; j++) {
				if(n!=i)
					System.out.print("*");
				else {
					for (int j2 = j; j2 < (n-1)*2+1; j2++) {
						System.out.println("*");
					}
				}
					
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("직각 이등변 삼각형을 출력합니다.");
		int n = stdIn.nextInt();
		spira(n);		
	}
}

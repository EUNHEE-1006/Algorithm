package algorithm_20200622;

import java.util.Scanner;

public class substract {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = stdIn.nextInt();
		System.out.println("숫자를 입력하세요");
		int b = stdIn.nextInt();
		
		while(b<=a) {
			System.out.println("숫자를 재입력해주세요!!");
			b=stdIn.nextInt();
		}
		System.out.println(b-a);
		
	}
}

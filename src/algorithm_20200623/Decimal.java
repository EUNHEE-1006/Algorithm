package algorithm_20200623;

import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("소수 구하는 프로그램입니다. 숫자를 입력해주세요>>");
		int num = stdIn.nextInt();
		
		boolean check = true;
		
		if(num==1) {
			System.out.print("소수는 1이 아닌 수를 대상으로 합니다. 숫자를 다시 입력해주세요>>");
			num = stdIn.nextInt();
		}else {
			for (int i = 2; i < num; i++) {
				if(num%i==0) {
					check = false;
				}
			}
		}
		if(check==true) {
			System.out.printf("%d는 소수입니다.",num);
		}else {
			System.out.printf("%d는 소수가 아닙니다.",num);
		}
	}
}

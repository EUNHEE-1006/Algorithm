package algorithm_20200623;

import java.util.Scanner;

public class GetDecimal {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("소수 구하는 프로그램입니다. 숫자를 입력해주세요>>");
		int num = stdIn.nextInt();
		
		boolean check = true;
		
		if(num==1) {
			System.out.print("소수는 1이 아닌 수를 대상으로 합니다. 숫자를 다시 입력해주세요>>");
			num = stdIn.nextInt();
		}else {
			System.out.printf("%d까지의 소수는 : ", num);
			for (int i = 2; i <=num ; i++) {
				for (int j = 2; j < i; j++) {
					if(i%j==0) {
						check =false;
					}
				}
				if(check==true) {
					System.out.print(i + " ");
				}
				check =true;
			}
		}

	}
}

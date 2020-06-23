package algorithm_20200622;

import java.util.Scanner;

public class infiniteloop {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = stdIn.nextInt();
		
		int i =1;
		int sum =0;
		while(i<=n) {
			sum +=i;
			i++;
		}
		System.out.printf("1부터 %d까지의 합은 %d 입니다. \n", n,sum);
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println(i);
	}
}

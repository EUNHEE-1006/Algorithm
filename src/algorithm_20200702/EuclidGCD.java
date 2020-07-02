package algorithm_20200702;

import java.util.Scanner;

public class EuclidGCD {
	
	public static int gcd(int first, int second) {
		if(second==0) {
			return first;
		}else {
			return gcd(first, second%first);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int first;
		int second;
		while(true) {
			System.out.println("숫자 2개를 입력하세요 . (단, 작은 수를 먼저 입력하세요.)");	
			first = stdIn.nextInt();
			second = stdIn.nextInt();
			if(first<second) {
				break;
			}		
		}
		System.out.println(first +"과 " + second + "의 최대공약수는 " + gcd(first, second) + "입니다.");
		
		
		
	}
}

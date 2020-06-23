package Algorithm_20200622;

import java.util.Scanner;

public class digit {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int no =1;
		
		while(num/10!=0) {
			no++;
			num/=10;
		}
		
		System.out.println("그 수는 " + no + "자리 입니다.");
		
	}
}

package algorithm_20200623;

import java.util.Scanner;

public class BackwardTransferNum {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		while(x!=0) {
			d[digits++] = dchar.charAt(x%r);
			x/=r;
		}
		return digits;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 진수로 변경하시겠습니까?");
		int r = stdIn.nextInt();
		System.out.printf("%d진수로 변경할 숫자를 입력해주세요!!", r);
		int x = stdIn.nextInt();
		char[] d = new char[10];
		
		int digits = cardConvR(x, r, d);
		for (int i = d.length-1; i >= 0; i--) {
			System.out.print(d[i] + " ");
		}
		
	}

}

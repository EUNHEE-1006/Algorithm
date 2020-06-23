package algorithm_20200623;

import java.util.Scanner;

public class FowardTranferNum {
	static int cardConv(int x, int r, char[] d)
	{
		int digits = 0;
		char[]temp = new char[10];
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(r + "|    " + x);
		while(x!=0) {
			temp[digits++] = dchar.charAt(x%r);
			x/=r;
			System.out.println(r + "|    " + x + "...." + temp[digits-1]);
			System.out.println("    +---------");
		}
		for (int i = 0; i < temp.length; i++) {
			d[i]=temp[temp.length-(i+1)];
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
		
		int digit = cardConv(x, r, d);
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		}		
	}


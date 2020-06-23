package Algorithm_20200622;

import java.util.Scanner;

public class medium {
	static int getmedium(int a, int b, int c) {		
	if(a>=b) {
		if(b>c) {
			return b;
		}else if(a>=c) {
			return c;
		}else {
			return a;
			}
		}else if(a>c) {
			return a;
		}else if(a<c) {
			return c;
		}else {
			return b;
		}
} 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a의 값을 입력하세요");
		int a = stdIn.nextInt();
		System.out.println("b의 값을 입력하세요");
		int b = stdIn.nextInt();
		System.out.println("c의 값을 입력하세요");
		int c = stdIn.nextInt();		
		int medium = getmedium(a, b, c);
	}
}




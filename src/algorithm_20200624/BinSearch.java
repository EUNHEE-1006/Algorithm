package algorithm_20200624;

import java.util.Scanner;

public class BinSearch {
	static int binsearch(int[] a, int key) {
		int first = 0;
		int last = a.length-1;
		int guess = (first + last)/2;
		
		while(a[guess]!=key) {
			if(a[guess]<key) {
				first=guess+1;
			}else {
				last=guess-1;
			}
			guess = (first + last)/2;
		}
		return guess;
	}
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		System.out.println("입력할 배열의 갯수는?");
		int num = stdIn.nextInt();
	
		int[] a = new int[10];
		for (int i = 0; i < num; i++) {
			a[i]=stdIn.nextInt();
		}
		System.out.println("찾고 싶은 값은?");
		int key = stdIn.nextInt();
		
		int result =binsearch(a, key);
		System.out.printf("해당 숫자는 %d번째에 있습니다.", result+1);
	}

}

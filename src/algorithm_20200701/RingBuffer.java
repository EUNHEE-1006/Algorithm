package algorithm_20200701;

import java.util.Scanner;

public class RingBuffer {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] que = new int[10];
		int count = 0;
		int num;
		
		do {			
			System.out.print("정수를 입력하세요>> (중지: -1)");
			num=stdIn.nextInt();
			
			que[count%10]=num;
			count ++;
			
			for (int i = 0; i < que.length; i++) {
				System.out.print(que[i] + " ");
			}
			System.out.println();
			
		}while(num!=-1);
	}

}

package algorithm_20200624;

import java.util.Scanner;

public class MultipleSearch {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int index=0;
		for (int i = 0; i < n; i++) {
			if(a[i]==key) {
				idx[index++]=i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		System.out.println("입력할 배열의 갯수는?");
		int n = stdIn.nextInt();
	
		int[] a = new int[10];
		int[] idx = new int[10];
		
		for (int i = 0; i < n; i++) {
			a[i]=stdIn.nextInt();
		}
		
		System.out.println("찾고 싶은 값은?");
		int key = stdIn.nextInt();
		
		int result = searchIdx(a,n,key,idx);
		System.out.printf("%d숫자는 %d개 있습니다.", key, result);
		
	}

}

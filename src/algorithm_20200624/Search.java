package algorithm_20200624;

import java.util.Scanner;

public class Search {
	static int search(int[] a, int key) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("입력하고 싶은 숫자의 갯수는?");
		int num= stdIn.nextInt();
		int[] a = new int[10];
		
		for (int i = 0; i < num; i++) {
			a[i]= stdIn.nextInt();
		}
		System.out.print("찾고싶은 숫자를 입력하세요!! ");
		int key = stdIn.nextInt();
		
		if(search(a, key)!=-1) {
			System.out.printf("해당 %d 값이 %d번째에 있습니다.", key, search(a, key)+1);
		}else {
			System.out.println("원하시는 결과가 없습니다.");
		}
		
	}

}

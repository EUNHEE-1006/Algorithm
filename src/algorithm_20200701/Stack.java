package algorithm_20200701;

public class Stack {
	
	private int max;
	private int ptr;
	private int[] stk;
	
	//생성자 
	public void IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		stk = new int[max];
	}
	//stk 초과
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
		
	}
	//stk 없음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public int push(int x) {
		if(ptr>=max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++]=x;
	}
	public int pop() {
		if(ptr<=0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	public int peek() {
		if(ptr<=0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr-1];
	}
	public int indexOf(int x) {
		for (int i = 0; i < ptr; i++) {
			if(stk[i]==x) {
				return i;
			}
		}
		return -1;
	}
	public void clear() {
		ptr = 0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return ptr;
	}
	public boolean isEmpty() {
		return ptr<=0;
	}
	public boolean isFull() {
		return ptr>=max;
	}
	
	public void dump() {
		if(ptr==0) {
			System.out.println("스택이 비어있습니다.");
		}else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}

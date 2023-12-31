package Stack;

import java.util.NoSuchElementException;

public class TwoStack<T> {
	
	
//	need to implement 
//	push1()
//	push2()
//	pop1()
//	pop2()
//	isEmpty1()
//	isEmpty2()
//	isFull1()
//	isFull2()
	
	
	private T[] arr;
	private Integer pointer1;
	private Integer pointer2;
	
	
	public TwoStack(int size){
//		size =size*2;
		arr= (T[] ) new Object[size];
		 this.pointer1=0;
		 this.pointer2 = size-1;
			
	}
	
	public void push1(T value) {
		
		if(isFull1()) {
			throw new StackOverflowError("Stack over flow");
		}
		
		this.arr[pointer1++] = value;
		
	}
	public void push2(T value) {
		
		if(isFull2()) {
			throw new StackOverflowError("Stack over flow");
		}
		
		this.arr[pointer2--] = value;
		
		
		
	}
	public T pop1() {
	
		if(isEmpty1()) {
			throw new NoSuchElementException("stack 1 is empty"); 
		}
//		System.out.println("last element in stack one "  + this.arr[pointer1--]);
		T rt = this.arr[pointer1-1];
		this.pointer1--;
		return rt;
	
	}
	public T pop2() {
		if(isEmpty2()) {
			throw new NoSuchElementException("Stack 2 is Empty ");
		}
		T ret = this.arr[pointer2+1];
		pointer2++;
		return ret;
		
		
	}
		public boolean isEmpty1() {
			
			return pointer1==0;
		}

		public boolean isEmpty2() {
			
			return pointer2==arr.length-1;
		}
		public boolean isFull1() {
			return pointer1-1>= pointer2;
		}

		public boolean isFull2() {
			return pointer1-1==pointer2;
		}
		
		
		public void print1() {
			for(int i =0;i<pointer1;i++) {
				System.out.println(this.arr[i]);
			}
		}
		public void print2() {
			for(int i =pointer2+1;i<arr.length;i++) {
				System.out.println(this.arr[i]);
			}
		}
		public void printAll() {
			for(int i =0;i<arr.length;i++) {
				System.out.println(this.arr[i]);
			}
		}
}

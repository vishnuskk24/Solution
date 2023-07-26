package Stack;

import java.util.NoSuchElementException;

public class ArrayStack<T> {

	
	private  T[] arr;
	private Integer top ;
//	private Integer bottom;
	
	private void checkFull() {
		if(isFull()) {
			throw new IllegalStateException("Stack Is full");
		}
	}
	private void checkEmpty() {
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is Empty");
			
		}
	}
	
	public  boolean isEmpty() {
		return top==0;
	}

	public boolean isFull() {
		return top>=arr.length;
	}
	public ArrayStack(Integer size) {
		this.arr=(T[] ) new Object[size];
		this.top=0; // setting the stack top pointer
//		this.bottom=0; // setting stack bottom pointer
		
		
	}
	
	
	public void push(T value) {
		checkFull();
		this.arr[top++]=value;
		
	}
	public T pop() {
		checkEmpty();
		 
		return this.arr[top--];
	}
}

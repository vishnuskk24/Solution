package Stack;

import java.util.NoSuchElementException;

public class ArrayStack<T>  implements Stack<T>{

	
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
	private T get(int index) {
		return this.arr[index];
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
		 
		return this.arr[--top];
	}
	public T peek() {
		checkEmpty();
		return get(top-1);
	}
	@Override
	public Integer size() {
		return top;
	}
	public Integer totalSize() {
		return this.arr.length;
	}
	public Integer availableSize() {
		return this.arr.length-top;
	}
	@Override
	public Integer search(T value) {
		checkEmpty();
		for(int i=top-1 ; i>=0;i--) {
			if(this.arr[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
	@Override
	public boolean isPresent(T value) {
		
		return -1!=search(value);
	}
	@Override
	public void print() {
		checkEmpty();
		System.out.print("[");
		for(int i=top-1;i>=0;i--) {
			if(i!=0) {
				System.out.print(this.arr[i]+", ");
				
			}else {
				System.out.print(this.arr[i]);
			}
			
		}System.out.println("]");
		
	}
	@Override
	public void printWithIndex() {
		// TODO Auto-generated method stub
		checkEmpty();
		
		for(int i=top-1;i>=0;i--) {
			
				System.out.println(i+"\t-->\t" +this.arr[i] );
				
			
			
		}
	}
}

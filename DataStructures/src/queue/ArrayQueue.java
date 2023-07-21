package queue;

public class ArrayQueue <T> implements Queue<T>{

	// implementation is done using array (circular array) its static in size 
	
	private	T[] arr;
	private int front=0;
	private	int back=0;  // two pointer that denotes the starting and ending point of queue
	private int count =0;
	
	// private methods
	
	private void checkEmpty() {
		if( arr==null ) {
			throw new IllegalStateException("Queue is Empty :(");
		}
	}
	private  void checkElements() {
		if(count==0) {
			throw new IllegalStateException("No Elements in Queue");
		}
	}
	public ArrayQueue(Integer size) {
		// TODO Auto-generated constructor stub
		this.arr = (T[] )new Object[size];
	}
	public void print() {
		int f=front;
		checkEmpty();System.out.println("count " + count);
		System.out.print("[");
		for(int i=0;i<count;i++,f++) {
			if(i+1==count) {
				System.out.println(arr[f%arr.length]+"]");
				continue;
			}
			System.out.print(arr[f%arr.length]+", ");
		}
	}
	
	private void makeEmpty() {
		checkEmpty();
		count=0;
	 front=0;
	 back = 0;
	 arr= (T[]) new Object[arr.length]; 
	}
	
	
	// public methods
	@Override
	public boolean isFull() {
		return arr.length<=count;
	}
	
	
	@Override
	public void enQueue(T value) {
		checkEmpty();
		if(isFull()) {
			 throw new IllegalStateException("Queue is Full");
		}
		arr[back]  = value;
		back = (back+1)%arr.length;
		count++;
	}
	
	@Override
	public T deQueue() {
		
		checkEmpty(); // we need to check no elements are there and 
					  // we need to check we have our array not suppose to be null 
		checkElements();
		
		
		var ret = arr[front];
		front = (front+1) % arr.length;
		count--;
		return ret;
	}
	
	@Override
	public Integer size() {
		return count;
	}
	
	@Override
	public T peek() {
		
		checkEmpty();
		checkElements();
		return arr[front];
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(count==0) {
			return true;
		}
		return false;
	}
	
//	enqueue
//	dequeue
//	peek
//	size
//	isFull()
//	isEmpty
	
	
}

package queue;

public class ArrayQueue <T>{

	
	T[] arr;
	int front=0;
	int back=0;  // two pointer that denotes the starting and ending point of queue
	
	// private methods
	
	private void checkEmpty() {
		if(back==0 || arr==null ||(front!=0 &&front==back)) {
			throw new IllegalStateException("Queue is Empty :(");
		}
	}
	public ArrayQueue(Integer size) {
		// TODO Auto-generated constructor stub
		this.arr = (T[] )new Object[size];
	}
	public void print() {
		checkEmpty();
		System.out.print("[");
		for(int i=front;i<back;i++) {
			if(i+1==back) {
				System.out.println(arr[i]+"]");
				continue;
			}
			System.out.print(arr[i]+", ");
		}
	}
	
	private void makeEmpty() {
		checkEmpty();
	 front=0;
	 back = 0;
	 arr= (T[]) new Object[arr.length]; 
	}
	
	
	// public methods
	public boolean isFull() {
		return arr.length<=back;
	}
	
	public void enQueue(T value) {
//		checkEmpty();
		if(isFull() || arr==null) { //  when back pointer crosses the last index
			throw new IllegalStateException( "Queue is Full :(");
		}
		
		arr[back]=value;
		
		back++;
		
	}
	public T deQueue() {
		
		checkEmpty(); // we need to check no elements are there and 
					  // we need to check we have our array not suppose to be null  
		if(back ==front) {
			throw new IllegalStateException("No Elements in Queue");
		}
		
		var ret = arr[front];
		front++;
		return ret;
	}
	
	public Integer size() {
		return back-front;
	}
	
	public T peek() {
		
		checkEmpty();
		return arr[front];
	}
	
//	enqueue
//	dequeue
//	peek
//	size
//	isFull()
//	isEmpty
	
	
}

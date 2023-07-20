package queue;

public class ArrayQueue <T>{

	
	private	T[] arr;
	private int front=0;
	private	int back=0;  // two pointer that denotes the starting and ending point of queue
	private int count =0;
	
	// private methods
	
	private void checkEmpty() {
		if( arr==null ||count==0) {
			throw new IllegalStateException("Queue is Empty :(");
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
	public boolean isFull() {
		return arr.length<=count;
	}
	
	public void enQueue(T value) {
//		checkEmpty();
		if(isFull() || arr==null) { //  when back pointer crosses the last index
			throw new IllegalStateException( "Queue is Full :(");
		}
		
		arr[back]=value;
		count++;
		back=(back+1)%arr.length;
		
	}
	public T deQueue() {
		
		checkEmpty(); // we need to check no elements are there and 
					  // we need to check we have our array not suppose to be null  
		if(count==0) {
			throw new IllegalStateException("No Elements in Queue");
		}
		
		var ret = arr[front];
		front = (front+1) % arr.length;
		count--;
		return ret;
	}
	
	public Integer size() {
		return count;
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

package ArraysList;

public class Array<T> {

	private int counter;
	 private int asize;
	 private T[] arr ;
	
	
	public Array(int size) {
	
	arr=(T[])new Object[size];
	
	}
	public int size() {
		return this.counter;
	}
	private   T[] transferArray() {
		
		T[] dup =(T[]) new Object[counter*2];
		for(int i=0;i<this.arr.length;i++) {
			dup[i]=this.arr[i];
		}
		return dup;
	}
	
	public void insert(T value) {
		
		if(arr.length<=counter) {
			this.arr=this.transferArray(); // copying all the values from existing array to new larger array
		}
		this.arr[counter] =value;
		this.counter++;
	}
	
	public int indexOf(T value) { 
		for(int i=0;i<this.arr.length;i++) {
			if(this.arr[i]==value) {
				return i;
			}
			
		}
		return -1;
	}
	public void print() {
		for(int i=0 ; i<this.counter;i++) {
			if(this.arr[i]==null) {
				break;
			}
			System.out.println(this.arr[i]);
		}
	}
	public boolean isPresent(T value) {
		for(int i=0;i<this.counter;i++) {
			if(this.arr[i]==value) {
				return true;
			}
			
		}
		return false;
	}
	
	public void removeAt(int index) throws Exception {
		if(index>=this.counter) {
			throw new Exception("Array Index Out of bound Array Size is " + this.counter + "  " + "Given index is " + index);
		}else {
			
			for(int start = index; start<counter-1; start++) {
				this.arr[start]=this.arr[start+1];
			}
			this.counter--;
		}
	}
	public void remove() {
		this.arr[this.counter-1]=null;
		this.counter--;
		
	}
	public T getLastIndex() {
		System.out.println(this.counter + " last index value");
		return this.arr[this.counter-1];

	}
	
	
	public void update(int index,T value) throws Exception {
		if(index>=this.counter) {
			throw new Exception("Array Index Out of bound Array Size is " + this.counter + "  " + "Given index is " + index);
		}else {
			
			this.arr[index] = value;
		}
	}
}

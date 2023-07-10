package ArraysList;

public class Array<T> {

	int counter;
	int asize;
	T[] arr ;
	
	
	public Array(int size) {
	
	arr=(T[])new Object[size];
	
	}
	public int size() {
		return this.counter;
	}
	public   T[] transferArray() {
		
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
		for(int i=0 ; i<this.arr.length;i++) {
			if(this.arr[i]==null) {
				break;
			}
			System.out.println(this.arr[i]);
		}
	}
	public boolean isPresent(T value) {
		for(int i=0;i<this.arr.length;i++) {
			if(this.arr[i]==value) {
				return true;
			}
			
		}
		return false;
	}
}

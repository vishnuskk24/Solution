package ArraysList;

public class Array<T> {

	private int counter;
	 private int asize;
	 private T[] arr ;
	
	
	public Array(int size) {
	
	arr=(T[])new Object[size];
	
	}
	public Array() {
		
		arr=(T[])new Object[10];
		
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
		
		if(arr.length<=this. counter) {
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
	
	public void printWithIndex() {
		for(int i=0 ; i<=this.counter;i++) {
			if(this.arr[i]==null) {
				break;
			}
			System.out.println("index  => " + i+ " "+  this.arr[i]);
		}
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
	private boolean isEmpty() {
		return (counter==0);
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
	public void insert(int index ,T value) throws Exception {
		if(counter<=index) {
			throw new Exception("Index Out of Bound");
		}
		if(arr.length<=this. counter) {  /// if the counter hits the total size of array
			this.arr=this.transferArray(); // copying all the values from existing array to new larger array
		}
		
		
		for(int i=counter-1;i>=index;i--) {
			
			this.arr[i+1] = this.arr[i];
//			System.out.println("pushing  values"+this.arr[i]+"("+i+") to next index "+this.arr[i+1]+"("+(i+1)+")");
		}
		this.arr[index]=value;
		this.counter++;
	}
	public void reverse() {
		
	 for(int i=0;i<counter/2;i++) {
		 
		 T temp=this.arr[i];
		 this.arr[i] = this.arr[this.counter-i-1] ;
		 this.arr[this.counter-i-1] =temp;
	 }
	
	 
	 
//	 public
//	  we are taking the networking session for bench enablement wth abdul and swetha tomorrow we are going to start with layer 2 protocols once these session is completed ill join bench enablement spring for ne and IOT and we  
	}
	
	public T[] getMiddle() {
		
		T []value;
		if(isEmpty()) {
			
		}
		//  allocating the size of array according to the list if the list have add number of element we will return one value else we need to return two values
		value  = (T[]) new Object[(counter%2==0?2:1)];
		System.out.println(value.length);
		if(counter%2==0) {
			value[0]=this.arr[(counter/2)-1];
			value[1]=this.arr[(counter/2)];
		}else {
			value[0]= this.arr[(counter/2)];
		}
		return value;
				
	}
	
	
	public T[] toArray() {
		if(size()==0) {
			return null;
		}
		T[] resp  =(T[]) new Object[size()];
		int i=0;
		for(T a:arr) {
			resp[i]=a;
			i++;
		}
		
		return resp;
	}
}
package heap;

public class Heap1<T extends Comparable<T>> {
 // finding parent formula  - >  (child index-1)/2
	private  T[] arr;
	private  int size;
	@SuppressWarnings("unchecked")
	Heap1(int size) {
		arr=(T[]) new Comparable[size];
	
		System.out.println("heap is ready");
//		arr = ((T[])new Object[size]);
		
	}
	private void swap(int first ,int second) {
		T temp = arr[first];
		arr[first] =arr[second];
		arr[second]=temp;
	}
	private Integer parent(int index) {
		return (index-1)/2;
	}
	public boolean isFull() {
		return 	size>=arr.length;
	}
	private void checkHeap() {
		if(isFull()) throw new IllegalStateException("Heap is full");
	}
	private void bubbleUp() {
		var index=size-1;
		checkHeap();    // (T)root.value).compareTo(value) ==0
		while(index>0 && ((T)(arr[index])).compareTo((T)(arr[parent(index)]))>0) {  //these while loop will execute until the parent item is greater then current item 
			swap(index,parent(index) );
			index=parent(index);  // continously we need to change the index and we need to check the condition 
		}
	}
	public void insert(T value) {
		
		arr[size++] = value;
//		if the adding item is greater then the parent item then we need o bubble up   now index = that size variable
		bubbleUp();
		print(size,arr);
		System.out.println("size of heap " + size);
	}
	public  void print(int size , T[] arr) {
		System.out.print("[");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
	
	 
}

// insert 
//remove 
//heap sort
//Kth largest element



//heap is special type of tree with two property
//1. completely filled except last level in some case and levels are filled from left to right
//2. every node is greater than or equal to its children (heap property)


//heap
//two types - > min heap (root node have minimum value)and max heap(root node have maximum value)


//Application 
//1. sorting(HeapSort)
//2. helps to implement in graph alogrithm(Shortest path)
//3. priority queue
//4. kth smallest value / largest value


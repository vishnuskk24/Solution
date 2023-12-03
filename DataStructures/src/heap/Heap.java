package heap;

import java.util.Arrays;

import ArraysList.Array;

public class Heap<T extends Comparable<T> > {
	
	private T[] arr ;
	private T[] rev;
	private int size;
	
	public Heap(int size) {
		
//		this.size=size;
		this.arr= (T[]) new Comparable[size];
		
		
		
	}
	
	public boolean isFull() {
		return size>=arr.length;
	}
		public int getParentIndex(int index) {
		return (index-1)/2;
	}
	private boolean isGreater(T child , T parent) {
//		if child value is greater than parent then it will return true    first value i is greater means then it wil return greater than 1
		return child.compareTo(parent)>0;
	}
	public void swap(int child, int parent ) {
		T temp = arr[child];
		arr[child] =arr[parent];
		arr[parent] = temp;
	}
	private void bubbleUp() {
		
		int child = size-1;
		while(getParentIndex(child)>=0 && isGreater(arr[child], arr[getParentIndex(child)]) ) {
			
			swap(child,getParentIndex(child));
			
			child =getParentIndex(child);
			
		}
	}
//	        0
//	  1           2
//  3   4      5       6	
	private int getLeftChildIndex(int index) {
		return index*2+1;
		
		
	}
private int getRightChildIndex(int index) {
		
		
	return index*2+2;
	}
	
	public void insert(T value) {
		if(isFull()) 
			throw new IllegalStateException("Heap is full");
		
		arr[size++]=value;
		// we need to check wheather the is acception max heap property
	
		bubbleUp();
//		print();
	}
	public void print() {
		System.out.println("\n Printing heap :)	");
		for(int i=0 ;i<size;i++) {
			if(i==size-1) 
			{
				System.out.print(arr[i]);
				return;
			}
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	private T getLeftChild(int index) {
		return arr[getLeftChildIndex(index)];
	}
	private T getRightChild(int index) {
	
		return arr[getRightChildIndex(index)];
	}
	private boolean isValidParent(int index) {
		// if left child itself not there then the value is in leaf node of the heap
//		this.print();
		if(!hasLeftChild(index)) {
//			System.out.println("no left child for " + arr[index]);
			return false;
		}
//			check whether the left child id greater then parent if greater then invald parent
//		System.out.println("\n " +arr[index] +  " have left child");
		boolean flag = isGreater(arr[getLeftChildIndex(index)],arr[index]);
//		check whether the right child id greater then parent if greater then invald parent
//		System.out.println("is left is greater then parent ?" + flag);
		if(hasRightChild(index)) {
//			System.out.println("have right child and is  right is greater then parent ?" + isGreater(getRightChild(index), arr[index]));
			flag|= isGreater(getRightChild(index), arr[index]);
		}
//		System.out.println(" returing by is valid  " + flag);
		return flag;
	}
	private int getGreaterChild(int index) {
		
		if(!hasLeftChild(index)) {
			return index;
		}
//		 sure it has left child
		if(!hasRightChild(index)) {
			return getLeftChildIndex(index);
		}
		
//		if both childs are there there compare both child
		
		return isGreater(getLeftChild(index),getRightChild(index)) ? getLeftChildIndex(index):getRightChildIndex(index);
	}
	public T remove() {
//		System.out.println("size before remove > " + size);
		int index = 0;
		T value = arr[index];
		arr[index]=arr[--size];
		bubbleDown(index);
//		System.out.println("size after remove ->" + size);
		return value;
//			
//		}
	
	}
	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index)<=size;
	}
	
	private boolean hasRightChild(int index) {
		return getRightChildIndex(index)<=size;
	}
	
	
	private void bubbleDown(int index) {
//		System.out.println((index<=size) +" " +( isValidParent(index)));
		
		while(index<size && isValidParent(index) ) {
//			System.out.println("\ninside while");
			 int greaterChildIndex = getGreaterChild(index);
			 swap(index,greaterChildIndex);
			 index=greaterChildIndex;
//			 print();
			}
	}
	
	private Heap takeCopy() {
		Heap<T> h = new Heap<>(size);
		for(int i = 0;i<size;i++) {
			h.arr[i]=this.arr[i];
			h.size++;
		}
		return h;
	}
	
	public Array<T> reverseSort() {
	if(isEmpty()) throw new IllegalStateException("Heap is Empty :(");
//		this.rev = (T[]) new Comparable[size];
	Array<T> res = new Array<>();
		int i=0;
		Heap<T> h = takeCopy();
		System.out.println();
			while(!h.isEmpty()) {
//				System.out.println("inserting in heap line 176");
			res.insert(h.remove());
				i++;
				
			}
			
//			System.out.println("converting into array in reverse line 173");
			return res;
	}
	public T getKthElement(int i) {
//		System.out.println("index - > " + i + " size - > " + size + " inside kth largest number");
		
		Array<T> rev = reverseSort();
		
		if(i >rev.size() || i<=0) return null;
		
		return  rev.get(i-1);
		
	}

}

package doublyLinkedList;

import java.util.NoSuchElementException;

;

public class DoublyLinkedList <T>{

	
	private class Node{
		private Node previous;
		T value;
		private Node next;
		public Node(T value) {
			this.value=value;
		}
		
		
	}
	
	public Node head ;
	public Node tail;
	 
	
	// implementing Private methods
	private void makeEmpty() {
		head=tail=null;
	}
	private void checkEmpty() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
	}
	
	
//	getPrevious node
//	getNode    - > it will return the node according to the index
	
	// implementing Public methods to use the Doubly Linked List data structures
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(T value) {
		Node node = new Node(value);
		if(isEmpty()) {
			// no Node is present 
		 // first node is created  place these first node in head and both tail
			head=tail=node;
			return;
		}
		// if some node is already Exist
		var temp =head;
		head =node;
		head.next=temp;
		temp.previous=head;
		
	}
	public void print() {
		if(isEmpty()) {// if  no node is present
			System.out.println("[]");
			return;
		}
		
		var current=head;
		System.out.print("[");
		
		while(current!=null) {
			if(current.next==null) { System.out.print(current.value);}
			else System.out.print(current.value+",");
			
		current=current.next;
		}	
		System.out.println("]");
	}
	public void printWithIndex() {
		if(isEmpty()) {
			System.out.println("[]");
			return;
		}
		int i=0;
		var current=head;
		System.out.println("++++++++++++++++++++++++");
		System.out.println("Index\t\tValue");
		System.out.println("++++++++++++++++++++++++");
		while(current!=null) {
			System.out.println(i+"\t\t"+current.value);
			i++;current=current.next;
		}
		System.out.println("++++++++++++++++++++++++");
	}
	public void reverse() {
		var current = tail;
		while(current!=null) {
			System.out.println(current.value);
			current=current.previous;
		}
	}
	public void addLast(T value) {
		Node node = new Node(value);
	if(isEmpty()) { //checking if the node is empty i true then create node assign head and tail as new node
		head=tail=node;
		return;
	}
		
		var temp=tail;
		tail=node; // assiging new node as last node
		temp.next=node; // assigning next value in tail previous node   //establishing connection from secondlast node to last node
		tail.previous=temp;   ////establishing connection from last node node to second last node
		
	}
	
	public Integer indexOf(T value) {
		var current=head;
		int i=0;
		while(current!=null) {
//			System.out.println("inside while " + i);
			if(current.value.equals(value)) {
				return i;
			}
			i++;
			current=current.next;
		}
		
		
		
		return -1;
	}
	
	public boolean contains(T value) {
		
		return -1!=indexOf(value);
	}
	public int count(T value) {
		int i=0;
		var current =head;
		
		while(current!=null) {
			if(value.equals(current.value)) {
				i++;
			}
			current=current.next;
		}
		
		return i;
	}
	public Integer[] getIndexes(T value){
		
//		if(isEmp)
		var current = head;
		Integer[] index = new Integer[count(value)];
		int i=0;
		int e=0;
		while(current!=null) {
			
			if(value.equals(current.value)) {
				
				System.out.println("indexes = >"+i);
				index[i]=e;
				i++;
			}
			e++;
			current=current.next;
			
		}
		
		return index;
	}
	public Integer size() {
		int size=0;
		var current =head;
		while (current!=null)
		{
			size++;
			current = current.next;
		}
		return size;
	}
	public T[] toArray() {
//	System.out.println("douby LL to array");
		@SuppressWarnings("unchecked")
		T[] ret  = (T[]) new Object[size()];
//		System.out.println("line 172");
		var current = head;
		int i=0;
//		System.out.println("before ehile");
		while(current!=null) {
//			System.out.println("insde while");
			
			ret[i]=current.value;
			current = current.next;
			i++;
		}
//		System.out.println("after while");
		
		return ret;
	}
	
	
	public void removeFirst() {
		checkEmpty();
		if(size()==1) {
			makeEmpty();
			return;
		}
		var temp = head; // taking head as a copy to disconnect the link to next node
		head=head.next; // making second element to the first element
		head.previous=null;  //disconnecting the link from head tto the removing element
		temp.previous=null; // discnnecting the link from removing element to first element 
	}
	
	public void removeLast() {
		checkEmpty();
		if(size()==1) {
			makeEmpty();
			return;
		}
		var temp= tail; //  taking last element as copy 
		tail=tail.previous;// meaking second last element as tail 
		tail.next=null;// disconnecting the seccond last elment to tail element 
		temp.previous=null;// disconnetcing the the last element and second last element
				
	}
	
	public T[] getMiddle() {
		checkEmpty();
		T[] ret = (T[])new  Object[size()%2==0?2:1];
		if(size()==1) {
			
			ret[0]=head.value;
			return ret;
		}
		if(size()==2) {
			ret[0]=head.value;
			ret[1]=head.next.value;
			return ret;
		}
		
		var fast=head;
		var slow = head;
		while((fast!=null && fast.next!=null)) {
			
			fast=fast.next.next;
			slow=slow.next;
		}
		if(size()%2==0) {
			ret[0]=slow.value;
			ret[1]=slow.next.value;
		}else {
			ret[0] = slow.value;
		}
		return ret;
	}
//	Opertions neeed to perform
	
//	isEmpty
	//addFirst
	//	Addlast
	// print
//	printWithIndex->
//	indexOf->
//	count->
//	contains->
//	size->
//	removeFirst->
//	removerLast->
//	toArray ->
//	getMiddle
//	hasLoop
//	makeLoop
//	BreakLoop
//	addBefore
//	addAfter
//	deleteNode // deleting the value according to the index
	
}

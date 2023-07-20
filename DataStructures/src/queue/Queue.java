package queue;

import java.util.NoSuchElementException;

public class Queue<T> {

	private Node front;
	private Node rear;
	
	private class Node{
		T value;
		Node next;
		
		public Node(T value) {
			this.value=value;
		}
	}
	
	
	
	// private methods

	private void checkEmpty() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
	}
	private void makeEmpty() {
		// TODO Auto-generated method stub
		front=rear=null;
		
	}
	
	
	
	
	// public methods
	
	public boolean isEmpty() {
		
		return front==null;
	}
	
	public void add(T value) { 
		Node n = new Node(value);
		
		if(isEmpty()) {
			front = rear=n;
			return;
		}
		rear.next=n;  // connecting last node to the rear side 
		rear=n;  //  making the new node as rear field
		return;
		
		
	}
	
	
	public T remove() {
		
		checkEmpty();  // no elements
		
		// only one element
		if(((Integer)front.hashCode()).equals((Integer)rear.hashCode())){ // if th queue have only one value make the queue empty and return the value
			var temp = front;
			makeEmpty();
			return temp.value;
			
		}
		
//		above one element
		
		var temp=front;
		
		front= front.next; // making the second node as first node
		temp.next=null;   // making breaking the former first node from its next node and making the garbage collector to take the unused object 
		return temp.value;// once you disconnect the first node send its value 
	}
	


}

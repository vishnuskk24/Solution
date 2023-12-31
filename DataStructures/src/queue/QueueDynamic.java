package queue;

import java.util.NoSuchElementException;


// Queue using LinkedList
public class QueueDynamic<T>  implements Queue<T>{

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
	@Override
	public Integer size() {
		
		int i=0;
		var current = front;
		while(current!=null) {
			
			current=current.next;i++;
			
		}
		return i;
	}
	
	
	// public methods
	@Override
	public boolean isEmpty() {
		
		return front==null;
	}
	@Override
	public void enQueue(T value) { 
		Node n = new Node(value);
		
		if(isEmpty()) {
			front = rear=n;
			return;
		}
		rear.next=n;  // connecting last node to the rear side 
		rear=n;  //  making the new node as rear field
		return;
		
		
	}
	
	@Override
	public T deQueue() {
		
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
	
	
	public void print() {
		checkEmpty();
		
		System.out.print("[");
		var current =front;
		while(current!=null) {
			if(current.next==null)
			{
				System.out.print(current.value);
			}else {
				System.out.print(current.value+", ");
			}
			
			current=current.next;
			
		}
		System.out.print("]");
	}
	
	public void printWithIndex() {
		
		checkEmpty();
		
		int i=0;
		var current = front;
		System.out.println("Index\t\tvalues");
		while(current!=null) {
		
			System.out.println(i+"\t\t"+current.value);
			current=current.next;
			i++;
			
		}
		
	}
	@Override
	public T peek() {
		checkEmpty();
		return front.value;
	}
	@Override
	public boolean isFull() {
	
		return false;
	}


}

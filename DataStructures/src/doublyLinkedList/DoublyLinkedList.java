package doublyLinkedList;

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
		}	System.out.print("]");
			
		
	}
	
	
	
	
	
	
//	Opertions neeed to perform
	
//	isEmpty
	//addFirst
	//	Addlast
	// print
//	printWithIndex
//	indexOf
//	count
//	contains
//	size
//	removeFirst
//	removerLast
//	toArray
//	getMiddle
//	hasLoop
//	makeLoop
//	BreakLoop
//	addBefore
//	addAfter
//	deleteNode // deleting the value according to the index
	
}

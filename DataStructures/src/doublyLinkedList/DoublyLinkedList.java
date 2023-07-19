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

package doublyLinkedList;

public class DoublyLinkedList <T>{

	
	private class Node{
		private Node previous;
		T value;
		private Node Next;
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
	
	public void addFirst() {
		if(isEmpty()) {
			// no Node is present 
			
		}
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

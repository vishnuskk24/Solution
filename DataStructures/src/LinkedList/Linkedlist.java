package LinkedList;

import java.util.NoSuchElementException;

public class Linkedlist<T> {

	private class Node{
		private T value;
		private Node next;
		
		private Node(T value) {
			this.value=value;
		}
		
	}
	
	private Node head;
	private Node tail;
	
	private boolean isEmpty() {
		return head==null;
	}
	private Node getPrevious(Node n) {
		
		var current = head;
		while(current!=null) {
			if(current.next.equals(n)) {
				return current;
			}
			current=current.next;
		}
		
		return null;
	}
	
	public void addFirst(T value) {
		var n = new Node(value);
		
		if(isEmpty()) {
			head=tail=n;
//			System.out.println("list is empty so asigning " + n + "to first and last ");
		}
		else {
			n.next=head;
//			System.out.println("List is not null so addng node in head and chaning the head node");
			head=n;
		}
		
		
	}
	public void addlast(T value) {
		
		var n = new Node(value);
		if(isEmpty()) {
//			System.out.println("list is empty so asigning " + n + "to first and last ");
			head=tail=n;
		}
		else {
//			System.out.println("List is not null so addng node in tail and chaning the tail node next ref");
			tail.next=n;
			tail=n;
		}
	}
	
	public void print() throws Exception {
		if(isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		Node n=head;
//		System.out.println(head.value);
		while(true) {
			System.out.println(n.value);
			if(n.next==null) {
				break;
			}
			n=n.next;
		}
	}
	public Integer indexOf(T value){
		Node n=head;
		int i=0;
//		System.out.println(head.value);
		while(n!=null) {
			if(n.value.equals(value)) {
				return i;
			}
			n=n.next;
			i++;	
		}
		return -1;
	}
	
	public void printWithIndex() throws Exception {
		if(isEmpty()) {
			throw new Exception("List is Empty");
		}
		int i=0;
		
		Node n=head;
//		System.out.println(head.value);
		System.out.println("===========================");
		System.out.println("Index\t||\tvalues");
		System.out.println("===========================");
		while(true) {
			System.out.println( i+"\t\t"+n.value );
			if(n.next==null) {
				break;
			}
			n=n.next;i++;
		}
		System.out.println("===========================");
	}
	
	
	public Integer count(T value) throws Exception {
		if(isEmpty()) {
			throw new Exception("List is Empty");
		}
		Node n=head;
		int count=0;
//		System.out.println(head.value);
		while(true) {
			if(n.value.equals(value)) {
				count++;
			}
			if(n.next==null) {
				break;
			}
			
			n=n.next;
			
		}
		
		
		return count;
		
	}
	
	public boolean contains(T value)  {
		
		
		
		return indexOf(value)!=-1;   // simplified manner
		
//		if(isEmpty()) {
//			return false;
//		}
		
		
//		Node v= head;
//		while(true) {
//			
//			if(value.equals(v.value)) {
//				return true;
//			}
//			if(v.next==null) {
//			break;
//			}
//			v=v.next;
//		}
//		
//		return false;
		
		
	}
	public Integer size() {
		
		
		
		
		if(isEmpty()) {
			return 0;
		}
		
		Node k = head;
		int size=1;
		while(true) {
			if(k.next==null) {
				break;
			}
			size++;
			k=k.next;
		}
		return size;
	}
	public void removeFirst() {
		if(isEmpty()) {
//			throw new NoSuchElementException();
			return;// you can throw exception depends on requirmentss
		}
		if(head.equals(tail)) {
			head=tail=null;
			return;
		}
		Node second=head.next;
		head.next=null;      //  breaking the first node link for garbage collector to collect the waste object
		head=second;
//		head=head.next;
//		head.next=null;
	}
	
	public void removeLast() throws Exception {
		
		if(isEmpty()) { // no elements
			throw new NoSuchElementException();
		}
		
		if(head.equals(tail)) { // only one element
//			System.out.println("head e tail");
			head=tail=null;
			return;
		}
//		System.out.println("execting line 213");
		var secondLast = getPrevious(tail);   // removing last node by defining one method to get second last node
//		System.out.println("printing second last value " + secondLast.value);
		tail=secondLast;                      // we can use these approach becoz we can use getprevious method  in future to manipulate the nodes in our linked list
		secondLast.next=null;
		
//		Node n = head;
//		while(true) {                         // or we can iterate till the second last  in these method to remove the last node 
//			if(n.next.next==null) {
//				n.next=null;
//				break;
//			}
//			n=n.next;
//			
//		}
	}
	
	public T[] toArray() {
		T[] arr;
		int size=size();
		if(size==0) {
			return null;
		}
		arr=(T[]) new Object[size];
		Node n =head;
		for(int i=0;i<size;i++) {
			arr[i]=n.value;
			n=n.next;
		}
		System.out.println("returning in to array" +arr.getClass().getSimpleName());
		
		
		return arr;
			
		}
	
	public T[] getMiddle() {
		Node first = head;
		Node second =head;
		
		T[] resp = (T[] ) new Object[2];
		
		if(isEmpty()) {
			return null; // if the list isempty
		}
		
		while((first!=null &&first.next!=null)) {
			
			if(first.next.next==null) {
				resp[0]=second.value;
				resp[1] =second.next.value; 
			}else {
				resp[0]=second.next.value;
			}
			
			first = first.next.next; // moving the first pointer twice
			second=second.next;//  moving second pointer one step
		}
//		when  the first reaches the last at the time the second will be in middle of the linked list
		
		return resp;

	}
	public void makeLoop() {
		tail.next=head;
	}
	public void breakLoop() {
		if(isEmpty()) return ;
		Node first = head;
		Node second =head;
		int i=0;
		while((first.next!=null && first.next.next!=null)) {
//			System.out.println(i);
		
			if( i!=0 &&((Integer)first.next.next.hashCode()).equals((Integer)second.next.hashCode())) {
//				System.out.println(first.hashCode()+"\n"+second.hashCode());
//				System.out.println(first.value + " " +second.value);
				
				first.next.next=null;
				return ;
			}
			
			first=first.next.next;
			second=second.next;
			i++;
		}
		
	}
	
	public boolean isLooped() {
		if(isEmpty()) return false;
		Node first = head;
		Node second =head;
		int i=0;
		while((first.next!=null && first.next.next!=null)) {
		
			if( i!=0 &&((Integer)first.hashCode()).equals((Integer)second.hashCode())) {
//				System.out.println(first.hashCode()+"\n"+second.hashCode());
//				System.out.println(first.value + " " +second.value);
				return true;
			}
			
			first=first.next.next;
			second=second.next;
			i++;
		}
		return false;
	}
	
	public void addBefore(int index ,T value) {
	
		
		if(index>size()) {
			throw new IllegalArgumentException("can't add before " + index + "because we have only " + ((size())-1) + " are present in our list");
		}
		if(index==0) {
			addFirst(value); // only one element present
			return;
		}
//		1   2  3 4  5        3 25
//		0   1  2 3  4
//		10 20 30 40 50
		var n = head;
		for(int i=1;i<index-1;i++) {
			
		System.out.println(i);
		n=n.next;
		
		}
		var newNode = new Node(value);
		newNode.next=n.next; // inserting the new node after the previous position   20 -> 25
		n.next=newNode;     // connecting the new node to the next node  25 - > 30
		
		
	}
	
	
	private Node getNode(int index) {
		Node n=head;
		if(index==0) {
			return head;
		}
		
		for(int i=0;i<index;i++) {
			n=n.next;
			if(i==index) {
				break;
			}
		}
		
		
		return n;
	}
	public void addAfter(int index , T value) {
		if(index>size())
		{
			throw new IllegalArgumentException("can't add before " + index + "because we have only " + ((size())-1) + " are present in our list");
		}
		var n=tail;
		if(index==size()-1) {
			
			
			addlast(value);
			return;
		}
		else {
			n = getNode(index);
			var  newNode = new Node(value);
			newNode.next=n.next;
			n.next=newNode;
		}
		
		
		
	}
	
	public void deleteNode(int index) throws Exception {
		if(index>=size()) {
			throw new IllegalArgumentException();
		}
		
		if(index==0) {
			removeFirst();
			return;
		}
		if(index ==size()-1) {
//			System.out.println("removing last node");
			removeLast();
			return;
		}
		var prev = getPrevious(getNode(index));
		var current = prev.next;
		prev.next = current.next;
		current.next=null;
	}
}

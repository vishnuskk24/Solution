package LinkedList;

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
	public Integer indexOf(T value) throws Exception {
		if(isEmpty()) {
			throw new Exception("List is Empty");
		}
		Node n=head;
		int i=0;
//		System.out.println(head.value);
		while(true) {
			if(n.value.equals(value)) {
				return i;
			}
			if(n.next==null) {
				break;
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
	
	public boolean contains(T value) {
		
		if(isEmpty()) {
			return false;
		}
		Node v= head;
		while(true) {
			
			if(value.equals(v.value)) {
				return true;
			}
			if(v.next==null) {
			break;
			}
			v=v.next;
		}
		
		return false;
		
		
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
			return;// you can throw exception depends on requirmentss
		}
		
		head=head.next;
//		head.next=null;
	}
	public void removeLast() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("List is empty");
		}
		
		if(head.equals(tail)) {
			head=tail=null;
			return;
		}
		
		Node n = head;
		while(true) {
			if(n.next.next==null) {
				n.next=null;
				break;
			}
			n=n.next;
			
		}
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
	
}

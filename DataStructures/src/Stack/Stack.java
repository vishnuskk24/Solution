package Stack;

public class Stack<T> {
	
	private class Node{
		private  T value;
		private Node next;
		
		Node(T value) {
			this.value=value;
		}
	}
	
	Node top;
	
	
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(T value) {
		
		Node n = new Node(value); //  created an node and inserted the value
//		need to check wheather  stack is empty or not
		if(isEmpty()) {
			top =n;
		}else {
			n.next=top;
			top=n;
		}
		
		
	}
	public  void  pop() {
		
		
		if(isEmpty()) {
			return;
		}
		 var temp = top;
		 top=top.next;
		 temp.next=null;
		 
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		
		return top.value;
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		
		var current=top;
		while( current!=null) {
			System.out.println(current.value);
			current=current.next;
					
		}
	}
	
	public void printInLine() {
		if(isEmpty()) {
			return;
		}
		
		var current=top;
		while( current!=null) {
			System.out.print(current.value);
			current=current.next;
					
		}
	}
	public void printWithIndex() {
		if(isEmpty()) {
			return;
		}
		
		int i=0;
		var current = top;
		System.out.println("Index\t\tvalue");
		
		while(current!=null) {
			System.out.println(i+"\t\t"+ current.value);
			current=current.next;
			i++;
		}
	}
	
	public Integer search(T value) {
		
		
		
		var current = top;
		int i=0;
		while(current!=null) {
			
			if(current.value.equals(value)) {
					return i;
			}
			i++;
			current = current.next;
			
		}
		
		
		return -1;  // if value is not present
		
	}
	
	public boolean isPresent(T value) {
		return -1!=search(value);
	}
}


//Operations:

//1. Push
//2.Pop
//3.peek()
//4.isEmpty()    all above operation will take O(1) Time complexity
//5.search
//6.isPresent


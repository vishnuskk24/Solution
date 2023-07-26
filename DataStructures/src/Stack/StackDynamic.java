package Stack;

public class StackDynamic<T> implements Stack<T> {
	
	private class Node{
		private  T value;
		private Node next;
		
		Node(T value) {
			this.value=value;
		}
	}
	
	Node top;
	
	
	@Override
	public boolean isEmpty() {
		return top==null;
	}
	@Override
	public Integer size() {
		Integer i =0;
		var current = top;
		while(current!=null) {
			i++;
			current=current.next;
		}
		return i;
	}
	@Override
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
	@Override
	public  T  pop() {
		
		
		if(isEmpty()) {
			throw new IllegalStateException("Stack is Empty :(");
		}
		
		 var temp = top;
		 top=top.next;
		 temp.next=null;
		 return temp.value;
		 
	}
	@Override
	public T peek() {
		if(isEmpty()) {
			return null;
		}
		
		return top.value;
	}
	@Override
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
	@Override
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
	@Override
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
	@Override
	public boolean isPresent(T value) {
		return -1!=search(value);
	}
	
	@SuppressWarnings("unchecked")
	public T min() throws Exception { 
		
		if(isEmpty()) {
			throw new Exception("List is Empty can't find minimum value");
		}
		var min = top.value;
		if(top.value instanceof Integer || top.value instanceof Double ||top.value instanceof Long ||top.value instanceof Integer ||top.value instanceof Float ||top.value instanceof Short) {
			
			
			
			var current = top;
			
			while(current!=null) {
				
				if(top.value instanceof Integer && (Integer) min >  (Integer)current.value) {
					min=current.value;
					
				}else if(top.value instanceof Double && (Double) min >  (Double)current.value) {
					min=current.value;
				}
				else if(top.value instanceof Float && (Float) min >  (Float)current.value) {
					min=current.value;
				}
				else if(top.value instanceof Long && (Long) min >  (Long)current.value) {
					min=current.value;
				}
				else if(top.value instanceof Short && (Short) min >  (Short)current.value) {
					min=current.value;
				}
					
					current=current.next;
			}
			
		}
		if(top.value instanceof String) {// these min will work  based in string length  || we can modify according to alphabetic order
			if(isEmpty()) {
				throw new Exception("List is Empty can't find minimum value");
			}
			String minimum = new String((String) top.value);
			var current  = top;
			while(current!=null) {
				if(current.value.toString().length()<minimum.length()) {
					minimum = (String) current.value;
				}
				current=current.next;
			}
			return (T) minimum;
		}
		return min;
	}
	@Override
	public boolean isFull() {
		// in dynamic stack it will increase and decrease the size automatically
		return false;
	}
	
}


//Operations:

//1. Push
//2.Pop
//3.peek()
//4.isEmpty()    all above operation will take O(1) Time complexity
//5.search
//6.isPresent


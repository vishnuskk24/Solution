package hash;

public class ChainedHash<T> {

	private Node[] arr=null;
	
	public ChainedHash(){
		arr= (Node[])new Object[100];
	}
	private class Node{
		
		private T value;
		private	Node next;
		
		private Node(T value) {
			this.value=value;
		}
	}
	private boolean isUserDefined(T value) {
		
		if(value instanceof Integer || value instanceof Double || value instanceof Long || value instanceof Character || value instanceof Boolean || value instanceof Float || value instanceof Byte  ) {
		
			return false;
		}
		return true;
		
	}
	
	private Integer generateHashForUserDefined( T value) {
		int index;
		String input  = new String(value.toString());
		int total=0;
		for(char c: input.toCharArray()) {
			total+=c;
			
		}
		 index = total%arr.length;
		
		return index;
	}
	
	
	private Integer genrateHashForPreDefined(T value) {
		Integer index =( (Integer) value) %arr.length;
		return index;
	}
		
	private Integer generateHash(T value ) {
		
		return isUserDefined(value)?generateHashForUserDefined(value):genrateHashForPreDefined(value);
		
	
	}
	
	private void  setNode(int index , Node n) {
		this.arr[index]= n;
	}
	
	private boolean isAvailable(int index) {
		
		return arr[index]==null?true:false;
	}
	
	private Node createNode(T value ) {
		
		return new Node(value);
		
	}
	
	private Node getLast(Node n) {  // thes method will get the last node in the linkedlist 
		
		var current = n;
		while(current.next!=null) {
			current=current.next;
		}
			
		
		return current;
	}
	private Node getNode(Integer index) {
		return arr[index];
		
	}
	
	public void put(T value) {
		
		Integer index = generateHash(value);
		Node n=createNode(value);
		
		if(isAvailable(index)) { // adding new node in the specfic index
			arr[index] = n;
		}else {  /// adding the new node in the chain 
			Node last = getLast(getNode(index));
			last.next=n;
		}
		
	}
	private boolean checkNode(Node n, T value) {
		
		var current = n;
		while(current.next!=null) {
			if( value.equals(current.value)) return true;
			current =current.next;
			
		}
		
		return false;
	}
	
	public boolean isPresent(T value) {
		Integer index = generateHash(value);
		
		return isAvailable(index)?false:checkNode(getNode(index),value);
		
	}
}
 
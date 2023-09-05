package tree;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class BinaryTree<T extends Comparable<T>>  {

	private Node root;
	private int size;
	
	private class Node<T>{
		
		private T value;
		private Node left;
		private Node right;
		
		
		public Node(T value) {
			this.value=value;
			
			
		}
	}
	
//	private boolean isUserDefined(T value) {
//		
//		if(value instanceof Integer || value instanceof Double || value instanceof Long || value instanceof Character || value instanceof Boolean || value instanceof Float || value instanceof Byte  ) {
//		
//			return false;
//		}
//		return true;
//		
//	}
	
	
	// property only two child needs to be there
	// left node needs to be lesser than current node and right node needs to be greater than current node value
	
	private void insert(Node n, T value) {
//			if compare to return value is positive then insertinf value is bigger choose right 
		if(value.compareTo((T) n.value) > 0) {  // we did insert using recursion  there is an another option to use while loop
			
			if(n.right==null) {
				this.size++;
				n.right=new Node(value);
				return;
			}
			insert(n.right,value);
			
		}else {
			if(n.left==null) {
				this.size++;
				n.left= new Node(value);
				return;
			}
			insert(n.left,value);
		}
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	public void insert(T value) {
		
		
		
		
		if (root==null) {
			this.size++;
			root= new Node(value);
			return;
		}
		
		insert(root,value);
		
	}
	public Integer size() {
		return this.size;
	}
	
	public boolean find(T value) {
		
		if (isEmpty()) {
			return false;
		}
		var current = root;
		while(current!=null) {
			if(value.compareTo((T) current.value)==0) {
				System.out.print( current.value);
				return true;
			}
			
			if(value.compareTo((T) current.value)>0) {
				System.out.print( current.value+" -> ");
				current=current.right;
			}else {
				System.out.print( current.value+" -> ");
				current=current.left;
			}
			
		}
		
		return false;
		
	}
	
}

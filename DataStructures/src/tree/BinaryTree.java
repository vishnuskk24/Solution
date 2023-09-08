package tree;
import java.util.List;
import java.util.NoSuchElementException;
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
	
	private T noElement() {
		throw new NoSuchElementException();
	}
	
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
	
	private void traversePreOrder(Node root) {
	
		if(root==null)return;//  basecondition 
		
		System.out.println(root.value);
		traversePreOrder(root.left);   // these eleft call will execute until pointer reach the left child  leaf node of each tree 
		traversePreOrder(root.right);
	}
	public void traversePreOrder() {
		
		traversePreOrder(root);
		
	}
	
	private void traverseInOrder(Node root) {
		
		if(root==null) {
		return;	
		}
		traverseInOrder(root.left);
		System.out.println(root.value);
		traverseInOrder(root.right);
	}
	public void traverseInOrder() {
		traverseInOrder(root);
	}
	
	public void traversePostOrder(Node root) {
		
		if (root==null) return;
		
		traversePostOrder(root.left);
		
		traversePostOrder(root.right);
		System.out.println(root.value);
		
	}
	public void traversePostOrder() {
		traversePostOrder(root);
	}
	
//	pre-order  -> root,left,right
//	inorder - > left root right
//	postOrder - > left right root
	
	
//	To calculate Height of the tree is postorder traversal
//	calculate the minimum value in that tree
	
	
	private int heightOfTree(Node root,int height) {
		
		if(root==null) {
//			System.out.println("height " + height);
			return height-1;
		}
		int left = heightOfTree(root.left,height+1);
		int right = heightOfTree(root.right,height+1);
		System.out.println(left + " "  + right);
		return (left>right)? left:right;
	}
	
	private Node getNode(T value) {
		
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		var current = root;
		while(current!=null) {
			
			if((value.compareTo((T) current.value)==0)){
				System.out.println("->" + current.value);
				return current;
			}
			if(value.compareTo((T) current.value)>0) {
				System.out.print(current.value+ "->");
				current=current.right;
				
			}else{
				System.out.print(current.value+ "->");
				current=current.left;
			}
			
		}
		throw new NoSuchElementException(); // if the else block inside while loop not executed the then the value is not present
	}
	
	public int heightOfTheTree(T value) {
		var root= getNode(value);
		return heightOfTree(root, 0);
	}
	public Integer heightOfRootNode() {
		return heightOfTree(root,0);
	}
	
//	private T min(Node n) { // it will visit all the node 
//	
//		if( n==null) {
//			return null;
//		}
//		T left=min(n.left);
//	    T right =min(n.right);
//		T min = (T) n.value;
//		System.out.println("node value  -> " +n.value +" left- > " +left + " right -  >  " + right);
//		if(left!=null && (left.compareTo(min))<0)
//			{
//			
//			min= left;
//			System.out.println("comparing left"+ left +" and root  becoz left is not null"+ root + " min = "+min );
//			}
//		if (right!=null && right.compareTo(min)<0) {
//			min= right;
//			System.out.println("comparing left"+ right +" and root  becoz right is not null "+ root + " min = "+min );
//		}
//	System.out.println("returning min to recursion call " + min);
//		return min;
//		
//	}
	
	
	private T min(Node n ) {
		if (n.left==null) {
			return (T) n.value;
		}
		return min(n.left);
	}
	public T min() {
//		if(isEmpty()) throw new NoSuchElementException();
		return isEmpty()?noElement():min(root);
	}
	
	private boolean equals(Node root,Node others) {
		
		if(root==null && others==null) {
			return true;
			
		}
		if((root==null&& others!=null) || (root!=null &&others==null)) return false;
//its preorder trversal -> root               left                          right
		if(root.value.equals(others.value) && equals(root.left,others.left) && equals(root.right,others.right)) {
			return true;
		}
		System.out.println(root.value +" " + others.value);
	return false;
	}
	
	public boolean equal(BinaryTree other) {
		
		
		return  (size()==other.size())?equals(root,other.root): false;
	}
	
}

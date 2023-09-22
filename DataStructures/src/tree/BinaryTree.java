package tree;
import java.util.ArrayList;
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
//		System.out.println(left + " "  + right);
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
	
	public boolean isBinarySearchTree() {
		
		return isBST(root,null,null);
	}
	private boolean isBST(Node root,T min, T max) {
		if(root==null) {
			return true;
		}
		if(min!=null && ((T)root.value).compareTo(min)<=0 || max!=null  && ((T)root.value).compareTo(max)>=0) {
			return false;
		};
//		   taking left child then value higher value needs to be root
//		taking right child then minimum value needs to be the root 
		return isBST(root.left, min, (T) root.value)&& isBST(root.right, (T) root.value, max) ;
	}
	
	private boolean kthNodeFromRoot(int k, Node root ,List<T> result) {
		
		if(k==0) {
			result.add((T) root.value);
//			System.out.println(root.value);
			return false; //  reached kth node
		}
		if(root.left==null && root.right==null &&k>=1) {
		
			return true; // tree dont have k depth so we need to print -1
		}
		boolean left =true;
		boolean right=true;
	
		if(root.left!=null) {
			left = kthNodeFromRoot(k-1, root.left,result); // if left is null then leave 
			
		}
		if(root.right!=null) {
			right=	kthNodeFromRoot(k-1, root.right,result);//if right is nulll then leave
			
		}
		
//		System.oust.println("root "+ root.value +"k  ->" + k);
		if(root.left!=null) {
			
//			System.out.println("Left tree" + left +" left value - > "+ root.left.value +" k - > " +( k-1));
		}
		if(root.right!=null) {
//			System.out.println("right tree" + right +" right value - > "+ root.right.value+" k - > " + (k-1));
			
		}
		
		
//		System.out.println("Left && right" + (left&&right));
//	Sysout
		return left && right;
			
			
	}
	private int countLeaves(Node root) {
		
		int left =0;
		int right=0;
		if(root.left==null && root.right==null) { //if it is leaf node
			return 1;
		}
		
		if(root.left!=null) {
			left=countLeaves(root.left);
						
		}
		if(root.right!=null) {
			right=countLeaves(root.right);
		}
		return left+right;
			
	}
	
	private T getMax(Node root) {
		
		if(root.right==null) {
			return (T) root.value;
		}
		return getMax(root.right);
	}
	
	private boolean isSibblings(Node root,T left, T right) {
//		System.out.println("finding left parent");
		T leftParent = findParent(root,left,null);
//		System.out.println("finding right parent");
		T rightParent=findParent(root, right,null);
		
//		System.out.println("left parent - > " + leftParent + " rightParent  -> " + rightParent);
		if(leftParent==null || rightParent==null) {
//			System.out.println("returing null becoz both parent are null");
			return false;
		}
		
//		System.out.println("comparing both left parent and right parent");
		return leftParent.equals(rightParent);
	}
	
	
	private T findParent(Node root, T value,T Parent) {
		
		if(root==null) {
			return null;
		}
		if(((T)(root.value)).compareTo(value)==0) {
			return (T)Parent;
		}
//					less
		if(((T)(root.value)).compareTo(value)<0) {
			return findParent(root.right, value, (T) root.value);
		}
		
			
		return findParent(root.left, value, (T) root.value);
	}

	
	private boolean contains(Node root,T value) {
		
		if(root==null) {// if root is null then it wil be null means leaf node
			return false;
		}
		
		if(((T)root.value).compareTo(value)==0) {// current value and provided value both are equal
			return true;
		}
		

		boolean flag=true; // these flag will decides for further recursion we need to choose the left or right node 
		
		if(((T)root.value).compareTo(value)<0) {  // if block willl execute if root value is less compare to given value then choose right
			flag = false;
		}
		
		return(flag)?contains(root.left,value):contains(root.right,value); // instead of using ternary operator we can user if else also it depends on your wish
	}
	
	public List<T> kthNodeFromRoot(int k) {
		List<T> result = new ArrayList<>();
		if(isEmpty()) {
			throw new NoSuchElementException("tree is Empty");
		}
		if(kthNodeFromRoot(k, root,result)) {
			
			System.out.println(-1 );
		}
		return result;
	}
	public	void levelOrderTravesal() {
		for(int i=0;i<heightOfRootNode();i++) {
			for(T value: kthNodeFromRoot(i)) {
				System.out.print( value+ " , ");
			}
			System.out.println();
		}
	}
	public void countLeaves() {
		if(isEmpty()) {
//			throw new NoSuchElementException("Tree is Empty");
			System.out.println(0);
			return;
		}
		System.out.println(countLeaves(root));
	}
	public T max() {
		if(isEmpty()) {
			throw new NoSuchElementException("Tree is Empty");
		}
		return getMax(root);
	}
	
	public boolean isSiblings(T left, T right) {
		
		if(isEmpty()) {
			System.out.println("list is empty");
			return false;
		}
//		System.out.println("Caling private methods");
		return isSibblings(root, left, right);
	}
	public boolean contains(T value) {
		
		if(isEmpty()) {
			return false;
		}
		return contains(root,value);
	}
}

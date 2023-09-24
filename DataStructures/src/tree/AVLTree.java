package tree;

public class AVLTree<T extends Comparable<T>>{

	
	private class AVLNode<T>{
		
		private T value;
		private AVLNode<T> left;
//		private AVLNode<T> left;
		private AVLNode<T> right;
		
		AVLNode(T data){
			
			this.value=data;
		}
		
		
	}
	
	
	private AVLNode root;
	
	private AVLNode insert( AVLNode root, T value) {
		
		
		
		if(root==null) {
			System.out.println("location found creating node and initilizing for " + value);
			return new AVLNode<T>(value);
		}
		
		// if it is not empty then you need to start comparing 
		
		if( ((T)root.value).compareTo(value) ==0) {
			System.out.println("value aready  exist returing root ");
			// if it is same value then skip it
			return root;
		}
//                less
		if(((T)root.value).compareTo(value)<0) { // if root value is less than the inserting valuechoose right sub tree
			System.out.println("taking right sub tree" );
			 // if right sub tree is not null then choose to recursive call
			root.right =insert(root.right,value);
		}else
		{
			// if left subtree is not empty then pass it to nxt recursive call
			System.out.println("taking left sub tree");
			root.left=insert(root.left,value);
		}
		System.out.println(" returing root " + root.value);
		return root;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(T value) {
		
		
	root= 	insert(root,value);
	}
	
	
	private boolean contains( AVLNode root,T value) {
		
		
		if(root==null) {
			return false;
		}else {
			System.out.println(root.value);
		}
		
		
			
		return (((T)root.value).compareTo(value)==0)?true:(((T)root.value).compareTo(value)<0)?contains(root.right,value): contains(root.left, value);
		
		
	}
	
	public boolean contains(T value) {
		
		if(isEmpty()) {
			System.out.println("tree is empty");
		}
		return contains(root, value);
	}
	
	private Integer getHeight(AVLNode root,int height) {
		
		int left =0;
		int right=0;
		
		if(root.left==null && root.right==null) {  // leaf node 
			return height;
		}
		
		if(root.left!=null) {
			left =getHeight(root.left, height+1);
		}
		if(root.right!=null) {
			right=getHeight(root.right,height+1);
		}
		
		return (left>right)?left:right;
	}
	public Integer getHeight() {
		if(isEmpty()) return -1;
		return  getHeight(root, 0);
	}
	
	private boolean isBalanced(AVLNode root) {
		

		int left = getHeight(root.left, 0);
		int right = getHeight(root.right, 0);
		
		return Math.abs(right-left)<=1; 
		
		
		
		
	}
	public Boolean isBalanced() {
		
		return isBalanced(root);
	}
}

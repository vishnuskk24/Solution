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
	
	private void insert( AVLNode root, T value) {
		
		
		
		// if it is not empty then you need to start comparing 
		
		if( ((T)root.value).compareTo(value) ==0) {
			// if it is same value then skip it
			return;
		}
//                less
		if(((T)root.value).compareTo(value)<0) { // if root value is less than the inserting valuechoose right sub tree
			if(root.right==null) { // if right sub tree is empty then insert the value then and there and return
				root.right=new AVLNode<T>(value);
				return;
			} // if right sub tree is not null then choose to recursive call
			insert(root.right,value);
		}else
		{
			if(root.left==null) {
				root.left=new AVLNode<T>(value);
				return;
			}// if left subtree is not empty then pass it to nxt recursive call
			insert(root.left,value);
		}
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(T value) {
		if(isEmpty()) {
			root=new AVLNode<T>(value);
			return;
		}
		
		insert(root,value);
	}
}

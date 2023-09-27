package tree;

public class AVLTree<T extends Comparable<T>>{

	
	private class AVLNode<T>{
		
		private T value;
		private AVLNode<T> left;
//		private AVLNode<T> left;
		private AVLNode<T> right;
		private int height;
		AVLNode(T data){
			
			this.value=data;
		}
		
		
	}
	
	
	private AVLNode root;
	
	private AVLNode insert( AVLNode root, T value) {
		
		
		
		if(root==null) {
//			System.out.println("location found creating node and initilizing for " + value);
			return new AVLNode<T>(value);
		}
		
		// if it is not empty then you need to start comparing 
		
		if( ((T)root.value).compareTo(value) ==0) {
//			System.out.println("value aready  exist returing root ");
			// if it is same value then skip it
			return root;
		}
//                less
		if(((T)root.value).compareTo(value)<0) { // if root value is less than the inserting valuechoose right sub tree
//			System.out.println("taking right sub tree" );
			 // if right sub tree is not null then choose to recursive call
			root.right =insert(root.right,value);
		}else
		{
			// if left subtree is not empty then pass it to nxt recursive call
//			System.out.println("taking left sub tree");
			root.left=insert(root.left,value);
		}
//		System.out.println(" returing root " + root.value);
		
//		System.out.println("left height " + height(root.left) + " right height " + height(root.right));
		root.height =Math.max(height(root.left),height(root.right))+1;
		setHeight(root);
		// balancefactor 
	
		
		return 	balance(root);
	}
	
	private AVLNode balance(AVLNode root) {
		if(isLeftHeavy(root)) {
			if(balanceFactor(root.left)<0) { // if block will decide it is an left skew or not 
				System.out.println("rotate left "+ root.left.value); // once the left rotation is done then  it will form left skew
				root.left=leftRotate(root.left);
			}
			root=rightRotate(root);
			System.out.println("right rotate "+ root.value);
		}
		else if(isRightHeavy(root)) {
			// if it is right heavy then take the right node
			if(balanceFactor(root.right)>0) {
				System.out.println("rotate right  "+ root.right.value);
				root .right= rightRotate(root.right);
			}
			root = leftRotate(root);
			System.out.println("rotate left " + root.value);
			
		}
		return root;
	}
	
	private AVLNode leftRotate(AVLNode root) {
		
		var newRoot=root.right;            // when we are rotating 10 makig 20's left at that time 15 will get clash so  take 10 and take 15
		
		                                                                                                        //     10
//			if the value is null of if any value is present then it il swap                                   //           20
     	root.right=newRoot.left ;                                                                             //       15      30
		
		newRoot.left=root; //   make 10 as 20's left  and calculate height after all assignment calcuate height
		setHeight(root);
		setHeight(newRoot);
		
		return newRoot;
	}
	private void setHeight(AVLNode node) { 
		
		node.height = Math.max(height(node.left), height(node.right))+1;
		
	}
	private AVLNode rightRotate(AVLNode root) {
		                                                  //   30
		                                                //  20
		                                               // 10  15
		var newRoot = root.left;// 20
		
		 // if any value is present ten clash will happen
	    root.left=newRoot.right;   //making 15 to 30 child
	
		newRoot.right=root;
		 
		setHeight(root);
		setHeight(newRoot);
		return newRoot;
		
	}
	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(T value) {
		
		
	root= 	insert(root,value);
	}
	
	private int height(AVLNode root) {
		return root==null?-1:root.height; 
	}
	private boolean isLeftHeavy(AVLNode root) {
		return balanceFactor(root)>1;
		
	}
	private boolean isRightHeavy(AVLNode root) {
		return balanceFactor(root)<-1;
	}
	private Integer balanceFactor(AVLNode root) {
//				       returing 0 becoz if it is leaf node  becoz height method will return -1
		return root==null?0: height(root.left)-height(root.right);
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
//			System.out.println("tree is empty");
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









//above returning root in insert method

//int balanceFactor = balanceFactor(root);
//if(isLeftHeavy(root)) {
//	if(balanceFactor(root.left)>0) {
//		System.out.println("left skew");
//		System.out.println("left heavy single rotation --  right rotation  ");
//	}
//	if(balanceFactor(root.left)<0) {
//		System.out.println("left of right subtree  double rotation   left  right rotation");
//	}
////	System.out.println("left tree is heavy and need to rotate right in "+ root.value +" while adding " + value + " becoz balance factor is "+ balanceFactor);
//	
//}
//
//else if(isRightHeavy(root)) {
//	
//	if(balanceFactor(root.right)>0) {
//		System.out.println("double rotation right - left rotation");
//	}
//	if(balanceFactor(root.right)<0) {
//		System.out.println("right skew");
//		System.out.println("single roatation left rotation ");
//	}
////	System.out.println("right tree is heavy and need to rotate left in " + root.value+" while adding " + value+ " becoz balance factor is "+ balanceFactor);
//}
//else {
//	System.out.println(" tree balanced " + root.value+" while adding " + value+ " becoz balance factor is "+ balanceFactor);
//}
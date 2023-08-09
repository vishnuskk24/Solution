package tree;

public class BinaryTree<T> {

	private Node root;
	
	private class Node<T>{
		
		private T value;
		private Node left;
		private Node right;
		
		public Node(T value) {
			this.value=value;
			
		}
	}
	
	private boolean isUserDefined(T value) {
		
		if(value instanceof Integer || value instanceof Double || value instanceof Long || value instanceof Character || value instanceof Boolean || value instanceof Float || value instanceof Byte  ) {
		
			return false;
		}
		return true;
		
	}
	
	
	// property only two child needs to be there
	// left node needs to be lesser than current node and right node needs to be greater than current node value
	
	public void insert(T value) {
		
		Node node = new Node(value);
		
		if (root==null) {
			root= new Node(value);
			return;
			
		}
		var current = root;
		
		
		while(true)
		{
//			if(!isUserDefined(value)) {
				
				if(value.hashCode()<current.value.hashCode()) {
					
					if(current.left==null) {
						current.left=node;
						break;
					}
					current=current.left;
				}
				else {
					if(current.right==null) {
						current.right=node;
						break;
					}
					current=current.right;
				}
				
				
//			}
		}
		
	}
	
}

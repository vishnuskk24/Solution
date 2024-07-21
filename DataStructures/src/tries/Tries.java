package tries;

public class Tries {

	
//	Node[] next ;
	public static int ALPHABET_SIZE=26;
	
	private class Node{
		Character value;
		Node[] children = new Node[ALPHABET_SIZE]; // no of alphabet
		boolean isEndOfTheWord;
		
		
		Node(char c) {
		
			this.value=c;
		}


		@Override
		public String toString() {
			return " value=" + value ;
		}
		
		
	}
	
	private Node root = new Node(' ');
	
	public void insert(String s) {
		
		var current =  root;
		for(char c : s.toCharArray()) {
			int charIndex = c-97;
			if(current.children[charIndex]==null) {
				current.children[charIndex] = new Node(c);
				
			}
			current = current.children[charIndex];
		}
		current.isEndOfTheWord=true;
	}
	
	
	public boolean isPresent(String s) {
		
		if(root==null|| root.children==null) {
			return false;
			
		}
		Node[]	current = root.children;
		int l=1;
		for(char c : s.toCharArray()) {
			int charIndex = c-97;
			if(current[charIndex] !=null ) {
				if(current[charIndex].isEndOfTheWord && l==s.toCharArray().length) {
					return true;
				}
				current=current[charIndex].children;
			}
			else {
				return false;
			}
			l++;
			
		}
		
		return false;
	}
	
}
package tries;

public class Tries2 {
	
	public static Integer ALPHABET_SIZE=26;
	private class Node{
		
		char value ;
		Node[] children =  new Node[ALPHABET_SIZE];
		boolean isEndOfWord=false;
		Node(char c){
			this.value=c;
		}
		
	}
	
	private Node root =  new Node(' ');
	
	public void insert(String s) {
		if(s==null) return ;
		Node current = root;
		
		for(char c:s.toCharArray() ) {
			
			int charIndex = c-97;
			if(current.children[charIndex]==null) {
				Node n = new Node(c);
				current.children[charIndex] = n;
				
			}
			current=current.children[charIndex];
			
		}
		current.isEndOfWord=true;
		
	}
	public boolean isPresent(String s) {
		if(s==null) return false;
		
		Node current = root;
		for(char c : s.toCharArray()) {
			int varIndex = c-97;
			if(current.children[varIndex]==null) {
				return false;
			}else {
				current=current.children[varIndex];
			}
			
		}
		if(current.isEndOfWord) {
			return true;
		}
		return false;
		
	}
	public void remove(String s) {
		
		if(s==null) return ;
		Node current = root;
		for(char c : s.toCharArray()) {
			int varIndex = c-97;
			if(current.children[varIndex]==null) {
				return;
			}else {
				current=current.children[varIndex];
			}
			
		}
		if(current.isEndOfWord) {
			current.isEndOfWord=false;
		}
		
	}

}

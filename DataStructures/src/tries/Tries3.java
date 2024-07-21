package tries;

import java.util.HashMap;

public class Tries3 { //  tries using hash table
	
	
	private static Integer ALPHABET_SIZE=26;
	private class Node{
		
		private Character value;
		private HashMap<Character,Node> children= new HashMap<>();
		private Boolean isEndOfWord=false;
		
		Node(Character c){
			this.value=c;
		}
		
		public void addChild(Character c) {
			children.put(c,new Node(c));
		}
		public Boolean hasChild(Character c) {
			return children.containsKey(c);
		}
		public Node getChild(Character c) {
			return children.get(c);
		}

		@Override
		public String toString() {
			return "Node [value=" + value + ", children=" + children + ", isEndOfWord=" + isEndOfWord + "]\n";
		}
		
	}
	
	
	private Node root = new Node(' ');
	
	public void insert(String s) {
		if(s==null) return ;
		
		Node current = root;
		for(char c : s.toCharArray()) {
			
			if(!current.hasChild(c)) {
				current.addChild(c);
			}
			current =current.getChild(c);
			
		}
		current.isEndOfWord=true;
		System.out.println(root);
	}
	
	public boolean isPresent(String s) {
		if(s==null) return false;
		
		Node current =  root;
		for(char c : s.toCharArray()) {
			
			if(current.hasChild(c)) {
				current=current.getChild(c);
			}
			else {
				break;
				
			}
		}
		if(current.isEndOfWord) {
			return true;
		}
		return false;
	}
	public void remove(String s) {
	
		if(s==null) return ;
		Node current =  root;
		for(char c : s.toCharArray()) {
			
			if(current.hasChild(c)) {
				current=current.getChild(c);
			}
			else {
				break;
				
			}
		}
		if(current.isEndOfWord) {
			current.isEndOfWord=false;
		}
	}


}

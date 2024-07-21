package tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
		public Node[] getAllChildren() {
			return children.values().toArray(new Node[0]);
		}

		public boolean haveAnyChild() {
			return getAllChildren().length>0;
		}
		public void removeChild(Character c) {
			
			children.remove(c);
		}
		@Override
		public String toString() {
			return "value=" + value + ", children=" + children + ", isEndOfWord=" + isEndOfWord + "\n";
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
//		System.out.println(root);
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

	public void preOrderTraversal() {
		preOrderTraversal(root);
		
	}
	private void preOrderTraversal(Node root) {
		System.out.println(root.value);
		for(Node n : root.getAllChildren()) {
			preOrderTraversal(n);
		}
		
	}
	
	
	public void postOrderTraversal() {
		postOrderTraversal(root);
		
	}
	private void postOrderTraversal(Node root) {
		
		for(Node n : root.getAllChildren()) {
			postOrderTraversal(n);
		}
		System.out.println(root.value);
		
	}
	public void removeWord(String s) {
		if(s==null)  return;
		System.out.println(root + " initial ++++++++++++++");
		removeWord(root,s.toCharArray(),0);
	}

	private void removeWord(Node root,char[] arr,int index) {
		
		
		if(root==null) {
			System.out.println("root null so return");
			return;
		}
		if(index==arr.length) {
			if(root.isEndOfWord==false) {System.out.println("word is not exist");}
			
			root.isEndOfWord=false;
			return;
			
		}
		Character childindex =  arr[index];
		Node child = root.getChild(childindex);
		
		removeWord(child,arr,index+1);
		
		if(! child.haveAnyChild() && !child.isEndOfWord) {  // if it is an end of word / having another child
			System.out.println("===============================");
			System.out.println("deleting " +child + "  \t becoz it is not having any child and it is not an end of the word");
			System.out.println("===============================");
			root.removeChild(childindex);
		}
		
		
		
	}
	public List<String> getSuggestion(String s) {
		List<String> result =  new ArrayList<>();
		
//		if(!isPresent(s)) {
//			return result; //  if the string is not present the return the empty list
//		}
		Node lastRoot =  getRootOfLastLetter(s);
		getSuggestion(lastRoot,  result,s);
		
		return result;
		
		
	}
	private Node getRootOfLastLetter(String s) {
		
		Node rest = root;
		
		if(s==null || rest==null) return rest;
		s=s.trim();
		for(char c : s.toCharArray()) {
			if(rest.getChild(c)==null) return null;
			rest=rest.getChild(c);
		}
//		System.out.println("returining node  -> " + rest);
		
		return rest;
		
	}
	
	private void getSuggestion(Node root, List<String> result ,String current)
	{
		if(root==null)return;
		if(root.isEndOfWord) {
			result.add(current);
			
		}
		if(!root.haveAnyChild()) {
			return;
		}
		for(Node n : root.getAllChildren()) {
			
			getSuggestion(n, result, current+n.value);
		}
		
		
	}
}

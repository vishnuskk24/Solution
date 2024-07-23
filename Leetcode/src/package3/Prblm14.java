package package3;

import java.util.HashMap;

public class Prblm14 {

	class Solution {
	     public Node root = new Node(' ');

	        private class Node{

	            private Character value;
	            private HashMap<Character,Node> children = new HashMap();
	            private boolean isEndOfWord;


	            Node(Character c){
	                this.value=c;

	            }
	            public void addChild(Character c){
	                children.put(c, new Node(c));
	            }
	            public Node[] getAllChild(){
	                return children.values().toArray(new Node[0]);
	            }
	            public Node getChild(Character c){
	                return children.get(c);
	            }
	          
	            public boolean hasChild(Character c){
	                return children.containsKey(c);
	            }

	        }

	        public void insert(String s){
	            insert(s,root);
	            
	        }
	        public void insert(String s, Node root){
	         

	            Node current = root;
	            for(Character c: s.toCharArray()){
	                if(!current.hasChild(c)){ // didnt have child
	                    current.addChild(c);   
	                }
	                current=current.getChild(c);

	            }
	            current.isEndOfWord=true;
	            //    System.out.println(root);
	            
	        }
	    public String getString(Solution s){
	            Node current = s.root;
	            String ret ="";
	            if(current!=null) {
	                   ret=ret+current.value;
	            }
	        while(current!=null && current.getAllChild().length==1 && current.isEndOfWord==false){

	         
	            current=current.getAllChild()[0];
	            // System.out.println(current.value + " +++");
	               ret=ret+current.value;

	        }
	        return ret;
	    }
	       
	    public String longestCommonPrefix(String[] strs) {

	        Solution s =  new Solution();
	       for(String ss:strs){
	             s.insert(ss);
	       }
	       String ret = getString(s);
	       System.out.println(ret);

	    //    if((ret.trim()).length()==1) return "";
	        
	        return ret.trim();
	    }
	}
}

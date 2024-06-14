package package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//  8,94,089
public class Prblm316 {
	public static void main(String[] args) {
		System.out.println("hello");
	}

	 public String removeDuplicateLetters(String s) {
	        
	        Stack<Character> st =  new Stack();
	        Map<Character,Integer> map =  new HashMap<>();
	        boolean[]  status =  new boolean[26];
	        

	        for(char c : s.toCharArray()){
	            map.put(c,map.getOrDefault(c,0)+1);
	            status[c%97]=false;
	        }
	        for(char c : s.toCharArray()){
	            while(!st.isEmpty() && st.peek()>c && map.get(st.peek())>0 && !status[c%97]){
	               status[st.pop()%97]=false;

	            }
	            
	                if(!status[c%97]){
	                st.push(c);
	                status[c%97]=true;
	               
	            }
	             map.put(c,map.get(c)-1);
	            
	        }

	        System.out.println(st);
	        String result =  new String();
	        while(!st.isEmpty()){
	            result = st.pop()+result;
	        }
	        return result;
	    }
}

package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;              // Prblm url - > https://leetcode.com/problems/valid-parentheses/description/
 									//  valid brackets

public class Prblm4 {
	
	
	 static   List<Character> openBrackets;
	  static   List<Character> closeBrackets;
	  static Map<Character,Character> map;
	 static{
	    openBrackets = new ArrayList<>();
	    closeBrackets = new ArrayList<>();
	    map  = new HashMap();

	    openBrackets.add('(');
	    openBrackets.add('{');
	    openBrackets.add('[');
	    openBrackets.add('<');
	    closeBrackets.add(')');
	    closeBrackets.add('}');
	    closeBrackets.add(']');
	    closeBrackets.add('>');
	    map.put('}','{');
	    map.put(')','('); 
	    map.put(']','[');
	     map.put('>','<');
	 }

	    public boolean isValid(String s) {

	        Stack<Character> stack = new Stack<>();
	       
	       
	        for(Character symbol  : s.toCharArray()  ){ // iterate all the element in the given input

	                // check the element is open bracket or close bracket

	                if(openBrackets.contains(symbol)){  // if its open bracket  push  into stack
	                System.out.println("have openbracket  so element is pushed  - > " + symbol );
	                stack.push(symbol);

	                }else{ // its close bracket
	                    if(stack.empty()){
	                        System.out.println("have close tag but stack is empty returninng false => " + symbol );
	                        return false;
	                    }
	                    if(stack.pop().equals(map.get(symbol))){// if both elements are equal the its closing properly  else retun false
	                    System.out.println("closeBracket");

	                    }else{
	                        return false;
	                    }

	                }
	        }
	        if(stack.empty()){
	            return true;
	        }else{
	            return false;
	        }



	        
	    }	
	public static void main(String[] args) {
		
		// call the method (:-{|) 😊😊😊😊
	}}

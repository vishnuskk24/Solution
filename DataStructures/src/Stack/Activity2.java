package Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Activity2 {

	
	public static  List<Character> openBrackets = null;
	public static  List<Character> closeBrackets = null;
	public static  Map<Character,Character> map = null;
	
	static
	{
		openBrackets=new ArrayList<>();
		closeBrackets=new ArrayList<Character>();
		map = new HashMap<>();
		openBrackets.add('{');
		openBrackets.add('[');
		openBrackets.add('<');
		openBrackets.add('(');
		closeBrackets.add('}');
		closeBrackets.add(']');
		closeBrackets.add('>');
		closeBrackets.add(')');
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		map.put('>', '<');
	}
	
	public static boolean isBalanced(String value) {
		boolean flag =false;
		Stack<Character> stack = new Stack<Character>();
		
		if(value==null) {
			throw new IllegalArgumentException();
		}
		
		for(Character c: value.toCharArray()) {
			if(!openBrackets.contains(c) && !closeBrackets.contains(c)) { // if it is not open or close brackets then skip
				continue;
			}
			if(openBrackets.contains(c)) {
				stack.push(c); // if it is an open brackets then add it to stack
			}else {
				// definetly it will be in close bracket
				if(stack.isEmpty()) {
					return false;
				}
//				Sy
				if(stack.peek().equals(map.get(c))) {
					stack.pop();
					flag=true;
				}else {
					
						return false;
					
//					System.out.println("retrning false not balanced " + c);
					
				}
			}
		}
		
		return stack.isEmpty();
//		if(stack.isEmpty()) {
//			return true;
//		}else {
//			return false;
//		}
//		//return flag;
//		
//		
////		return true;
	}
	
	public static void main(String[] args){
		
		String input = "(";//"(1(<12[]>){}){[}]";
		if(isBalanced(input)) {
			System.out.println("statement is balanced");
			
		}else {
			System.out.println("statement is not balanced");	
		}
		
		
	}
	
	// kth node in linked list 
//	 // reverse the linked list
	//implement full doubly linked list
	// implement twostacks in one array
	// find minimum value in stack
}

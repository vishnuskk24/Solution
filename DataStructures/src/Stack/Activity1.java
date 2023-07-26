package Stack;

public class Activity1 {
	
	public static  String reverse(String s) throws IllegalAccessException {
		if(s==null) {
			throw new IllegalAccessException();
		}
		
		StackDynamic<Character> c= new StackDynamic<Character>();
		char[] input = s.toCharArray();
		for(Character a:input) {
			c.push(a);
		}
//		String result="";  //we can use String If size of string is more the it take more space while concatinating so we can use string buffer 
		StringBuffer result= new StringBuffer();
//		c.printInLine();
		while(!c.isEmpty()) {
//			result+=c.pop();
			result.append(c.pop());
			
		}
		return result.toString();
	}
	

	public static void main(String[] args) throws IllegalAccessException {
		
		String input = "abc";
		System.out.println(reverse(input));
		
	}
}

package Stack;

public class Activity1 {
	
	public static  void reverse(String s) {
		
		Stack<Character> c= new Stack<Character>();
		char[] input = s.toCharArray();
		for(Character a:input) {
			c.push(a);
		}
		c.printInLine();
	}
	

	public static void main(String[] args) {
		
		String input = "abc";
		reverse(input);
		
	}
}

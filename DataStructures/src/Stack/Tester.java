package Stack;

public class Tester {

	public static void main(String[] args) {
		
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);   // push is working
		s.printWithIndex(); // print is also working
//		System.out.println(s.peek());
		s.pop(); // pop opertion is also working
		s.printWithIndex();
		
		System.out.println(s.isEmpty()); //  done
		
		
		

		
	}
}

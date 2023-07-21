package Stack;

public class Tester {

	public static void main(String[] args) throws Exception {
		
		
		Stack<String> s = new Stack<>();
		s.push("ss");
		s.push("Vishnu");
		s.push("Sarv");
		s.push("Sar");
		s.push("sv");   // push is working
		 // print is also working
		s.pop();
		s.printWithIndex();
		System.out.println(s.size());
////		System.out.println(s.peek());
//		s.pop(); // pop opertion is also working
//		s.printWithIndex();
//		System.out.println(s.isPresent(10));
//		System.out.println(s.search(10));  // it wil return index
//		System.out.println(s.isEmpty()); //  done
		
		
		System.out.println( " Minimum "+s.min());
		// these file will test the methods
//		 in another file we will solve the prblms 
		
		

		
	}
}

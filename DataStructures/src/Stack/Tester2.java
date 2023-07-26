package Stack;

public class Tester2 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new ArrayStack(5);
		
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.isFull());
		
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(1);
//		stack.push(0);
//		stack.push(6);
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//			
//		}
//		stack.printWithIndex();
//		System.out.println(stack.isPresent(5));
//		
//		System.out.println(stack.search(5));
//		stack.print();
//		System.out.println(stack.peek());
		System.out.println(stack.size());
//		System.out.println(stack.availableSize());  
	}
	
}

package Stack;

public class Tester3 {

	
	public static void main(String[] args) {
		TwoStack<Integer> stack = new TwoStack<Integer>(5);
		
		stack.push1(2);
		stack.push1(4);
		stack.push1(8);
		stack.push2(16);
		stack.push2(20);
		System.out.println(stack.pop2()+ " +++++++++++++");
//		stack.print2();
		stack.printAll();
		stack.push1(786);
		System.out.println("------------");
//		stack.printAll();
//		stack.print1();
		stack.print2();
		stack.push2(3);
	}
}


package queue;

import Stack.Stack;

public class Activity1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new Queue<>();
		
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.printWithIndex();
		while(!queue.isEmpty()) {
			
			stack.push(queue.remove());
			
		}
		
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		queue.printWithIndex();
	}
}

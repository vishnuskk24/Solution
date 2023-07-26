package queue;

import Stack.StackDynamic;

public class Activity1 {

	public static void main(String[] args) {
		StackDynamic<Integer> stack = new StackDynamic<Integer>();
		QueueDynamic<Integer> queue = new QueueDynamic<>();
		
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.printWithIndex();
		while(!queue.isEmpty()) {
			
			stack.push(queue.deQueue());
			
		}
		
		while(!stack.isEmpty()) {
			queue.enQueue(stack.pop());
		}
		queue.printWithIndex();
	}
}

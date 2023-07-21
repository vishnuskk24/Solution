package queue;

public class Tester {

	
	public static void main(String[] args) {
		
		QueueDynamic<Integer> queue = new QueueDynamic<>();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		System.out.println(queue.deQueue());
		queue.enQueue(40);
		queue.enQueue(50);
//		System.out.println(queue.peek());
//		queue.printWithIndex();
		System.out.println(queue.size());
		
//		queue.print();
		
	}
	
	
	
//		Enqueue
//		Dequeue
//		isEmpty
//		isFull
//		Front
//		Rear
//		Implementation of Queue using array , linked list
//		size
// 		isPresent
	
}

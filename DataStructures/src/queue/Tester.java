package queue;

public class Tester {

	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
//		System.out.println(queue.remove());
		queue.add(40);
		queue.add(50);
		System.out.println(queue.peek());
		queue.printWithIndex();
		
		
//		queue.print();
		
	}
	
	
	
//		Enqueue
//		Dequeue
//		isEmpty
//		isFull
//		Front
//		Rear
//		mplementation of Queue using array , linked list
//		size
	// isPresent
	
}

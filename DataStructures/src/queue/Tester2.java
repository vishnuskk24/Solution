package queue;

public class Tester2 {

	 /// class to test the array Queue
	public static void main(String[] args) {
		
		
		
		Queue<Integer> arrQ = new ArrayQueue<>(3);
		
		arrQ.enQueue(10);
		arrQ.enQueue(20);
//		
		arrQ.enQueue(30);
		arrQ.deQueue();
		arrQ.deQueue();
		arrQ.deQueue();
		arrQ.enQueue(40);
		arrQ.enQueue(50);
		arrQ.enQueue(60);
//		arrQ.enQueue(40);
		
//		System.out.println(arrQ.size());
//		System.out.println(arrQ.peek());
//		arrQ.deQueue();
		while(!arrQ.isEmpty()) {
			System.out.println(arrQ.deQueue());
		}
		
//	
	}
}
//peek
//enqueue
//size
//print
//isfull()
//isEmpty()
//Dequeue

// implementing the queue using stack
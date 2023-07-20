package queue;

public class Tester2 {

	 /// class to test the array Queue
	public static void main(String[] args) {
		
		
		
		ArrayQueue<Integer> arrQ = new ArrayQueue<>(5);
//		arrQ.enQueue(10);
		arrQ.enQueue(20);
//		arrQ.enQueue(30);
//		arrQ.enQueue(40);
//		arrQ.enQueue(30);
//		arrQ.enQueue(30);
//		System.out.println(arrQ.deQueue());
//		System.out.println(arrQ.deQueue());
//		System.out.println(arrQ.deQueue());
//		System.out.println(arrQ.deQueue());
//		System.out.println(arrQ.deQueue());
//		System.out.println(arrQ.deQueue());
		
		
//		arrQ.print();
		System.out.println(arrQ.peek());
		
		System.out.println(arrQ.size());
	}
}
//peek
//enqueue
//size
//print
//isfull()
//isEmpty()
//Dequeue
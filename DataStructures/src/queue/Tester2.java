package queue;

public class Tester2 {

	 /// class to test the array Queue
	public static void main(String[] args) {
		
		
		
		ArrayQueue<Integer> arrQ = new ArrayQueue<>(3);
//		arrQ.enQueue(10);
		arrQ.enQueue(20);
		arrQ.enQueue(30);
		arrQ.enQueue(40);
		System.out.println(arrQ.deQueue());  // 30 40
		arrQ.enQueue(50); // 30 40 50
//		arrQ.enQueue(60);
//		arrQ.enQueue(70);
		System.out.println(arrQ.deQueue());// 40 50 
		arrQ.enQueue(30);
//		
		arrQ.print();
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
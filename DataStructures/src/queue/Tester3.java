package queue;

public class Tester3 {

	
	public static void main(String[] args) {
		Queue<Integer> q = new QueueSt<>();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40); //10 20 30 40
		q.deQueue(); //20 30 40
		q.enQueue(50);//20 30 40 50
		q.enQueue(60);
		q.enQueue(70);// 20 30 40 50 60 70
		q.deQueue();
		q.enQueue(80);
//		q.deQueue();
//		q.deQueue();
		System.out.println(q.peek());
		System.out.println(q.size());
		while(!q.isEmpty()) {
			System.out.println(q.deQueue());
		}
		
	}
}

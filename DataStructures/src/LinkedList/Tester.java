package LinkedList;

public class Tester {

	public static void main(String []args) throws Exception {
		Linkedlist<Integer> l = new Linkedlist<>();
//		l.addFirst(10);
//		l.addFirst(20);
////		l.addFirst(130);
//		
//		l.addFirst(10);
//		l.addFirst(10);
//		l.addFirst(10000);
//		l.addlast(400);
//		l.addlast(10);
//		l.addlast(10);
//		l.printWithIndex();
//		l.removeFirst();
//		l.printWithIndex();

		//		System.out.println(l.indexOf(400));
//		System.out.println(l.count(10));
//		System.out.println(l.contains(100) );
//		System.out.println(l.size());
		
		l.addFirst(10);
		l.addlast(20);
		l.addlast(30);
		l.addlast(40);
		l.addlast(50);
		l.printWithIndex();
//		l.removeLast();
//		l.printWithIndex();
		
//		System.out.println(l.toArray());
		Object [] a = l.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].getClass());
		}
	}
}

// add first
//addlast
// print
// printWithIndex
//count
// indexOf
//contains
// size
//  remove first
//  remove last
//to array

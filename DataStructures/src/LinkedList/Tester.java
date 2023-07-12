package LinkedList;

import java.util.LinkedList;

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
		l.addlast(60);
		l.addlast(70);
		l.addlast(80);
		l.addlast(90);
		l.addlast(100);
		l.printWithIndex();
		l.removeFirst();
		l.printWithIndex();
//		l.removeLast();
//		l.printWithIndex();
		
//		System.out.println(l.toArray());
//		Object [] a = l.toArray();
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i].getClass());
//			LinkedList<Integer> il;
//			
//		}
//		System.out.println(l.contains(1000));
//		l.printWithIndex();
//		System.out.println(l.isLooped());
//		l.makeLoop();
//		System.out.println(l.isLooped());
//		l.breakLoop();
//		System.out.println(l.isLooped());
//		l.printWithIndex();
		
		
//		System.out.println(l.isLooped());
//		for(Object o: l.getMiddle()) {
//			if(o==null) break;
////		System.out.println((Integer)o);
//		}
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
// find middle node
//  has loop	
// make loop   - >  these make loop methos makes linear linked list into an circular liked list
// break loop-- >  when two upcoming pointers are same then the we need to make the fast or first (pointer that is moving twicee speed )  we need to make it null
//
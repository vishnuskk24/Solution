package doublyLinkedList;

public class Tester {

	
	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//		list.addFirst(10);
//		list.addFirst(20);
//		list.addFirst(30);
//		list.addFirst(40);
		
		list.addLast(10);	
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(10);
		
		
//		list.print();
		list.printWithIndex();
		
		list.removeFirst();
		list.printWithIndex();
//		list.reverse();
//		System.out.println(list.indexOf(100));
//		System.out.println(list.count(200));
//		System.out.println(list.contains(100));
		
//	for(Integer a :list.getIndexes(10)) {
//		
//		System.out.println(a);
//	}
//	for(Object  o : list.toArray()) {
////		System.out.println("inside for");
//		System.out.println(o);
//	}
	}
	
}

//Completed:
//addfirst  
//print
//Printwith index
//reverse    - > we can iterate the value value from reverse also becoz our tail have last node ref  that last node have their previous node reference
//addlast 
//contains
//indexOf
// count 
// getIndexes
//size
//to array



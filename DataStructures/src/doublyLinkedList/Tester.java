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
		list.print();
		list.printWithIndex();
		list.reverse();
	}
}

//Completed:
//addfirst  
//print
//Printwith index
//reverse    - > we can iterate the value value from reverse also becoz our tail have last node ref  that last node have their previous node reference
//addlast 


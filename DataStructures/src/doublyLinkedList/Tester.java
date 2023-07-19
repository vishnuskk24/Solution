package doublyLinkedList;

public class Tester {

	
	public static void main(String[] args) {
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.print();
	}
}

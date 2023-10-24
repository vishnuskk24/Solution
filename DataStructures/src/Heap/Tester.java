package Heap;


class Kid<T> implements Comparable<T>{

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class Tester {
	public static void main(String[] args) {
		Heap<Integer> heap = new Heap<>(20);
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.insert(50);
		heap.insert(60);
		heap.insert(70);
		heap.insert(80);
		System.out.println("inserting begins");
//		heap.insert("Dom");
//		heap.insert("lucifer");
//		heap.insert("drago");
//		heap.insert("khal");
//		heap.insert("Jonn");
//		heap.insert("josh");
//		heap.insert("bala");
//		heap.insert("ajith");
//		heap.insert("charlie");
//		heap.insert("eric");
//		System.out.println();
	}
}

package heap;

import ArraysList.Array;

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
//		System.out.println("before array");
		int[] num = {2,1,4,5,3,6};//,11,10,12,17,15,19,20,30,33,36,34,37,33};
//		System.out.println("aftesr array");
		for(int i : num) {
			System.out.println("inserting " + i);
//			break;
			heap.insert(i);
		}
//		heap.print();
////		System.out.println("removing - > " + heap.remove());
////		heap.print();
//		int []sortedarray =  new int[num.length];
////		System.out.println(heap.remove());
////		heap.print();
//		for(int i=0;i<sortedarray.length;i++) {
//			sortedarray[i]=heap.remove();
//		}
//		
////		heap.print();
////		System.out.println(heap.remove());
		System.out.println("calling reverse");
		Array<Integer> a = heap.reverseSort();
		
		System.out.println("before priniting" + a.size());
		a.print();
		System.out.println("after priniting +++++++++++++");
		
		int i = 6;
		
		System.out.println(i + " th largest element " + heap.getKthElement(i));
		
		
		
//		Integer[] result = new Integer[10]; 
//		int c= 0;
//		while(!heap.isEmpty()) {
////			System.out.println(heap.remove());
//			
//			result[c] = heap.remove();
//			c++;
//			if(c>=0) System.out.println(result[c-1]);
////			heap.print();
//		
//		}
//		System.out.println(result[4] + " 6 largest");
//		for(int j:sortedarray) {
//			System.out.println(j);
//		}
////		heap.insert(10);
////		heap.insert(5);
		
		
		
//		Heap<String> heap = new Heap<>(10);
//		heap.insert("Vishnu");
//		heap.insert("Saravana");
//		heap.insert("Ashok");
//		heap.insert("Raj");
//		heap.insert("Uma");
//		heap.insert("Murugesan");
//		heap.insert("A		rrun");
//		heap.insert("Arsun");
//		while(!heap.isEmpty()) {
//			System.out.println(heap.remove());
//			
//		}
//		System.out.println("insertion is done");
//		System.out.println(heap.remove());
//		heap.print();
//		for(int i=0;i<4;i++) {
//			System.out.println(heap.remove());
//		}
//			sortedarray[i]=heap.remove();
//		}
		
				
//		heap.insert(17);
//		heap.insert(4);
//		heap.insert(22);
////		heap.print();
////		heap.remove();
//		heap.insert(60);
//		heap.insert(70);
//		heap.insert(80);
		
//		
//		(15, 10, 3, 8, 12, 9, 4, 1, 24)
//		heap.insert(15);
//		heap.insert(10);
//		heap.insert(3);
//		heap.insert(8);
//		heap.insert(12);
//		heap.insert(9);
//		heap.insert(4);
//		heap.insert(1);
//		heap.insert(24);
//		System.out.println("inserting begins");
//		heap.print();
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



//   need to complete  priority queues	
//   Heapify
//   Kth largest element
//   assignments
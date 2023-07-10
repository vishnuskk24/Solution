package ArraysList;

public class Tester {

	public static void main(String[] args) throws Exception {
		
		Array<Integer> numbers = new Array<>(2);
//		System.out.println(numbers.size() + " Size");
		numbers.insert(5);
		numbers.insert(4);
//		System.out.println(numbers.size());
		numbers.insert(6);
		System.out.println(numbers.size());
//		numbers.remove();
//		System.out.println(numbers.size());
		
		
		numbers.insert(7);
		numbers.print(); System.out.println( "--------------------------");
//		numbers.removeAt(3);
		numbers.update(3,32);
		numbers.print();
		System.out.println(numbers.size());
	}
}


// insert
// read 
// remove according to index

// size
//ispresent
// indexof
// remove last
//get last elements
//update method
package ArraysList;

public class Tester {

	public static void main(String[] args) throws Exception {
		
//		Array<Integer> numbers = new Array<>(2);
////		System.out.println(numbers.size() + " Size");
//		numbers.insert(5);
//		numbers.insert(4);
////		System.out.println(numbers.size());
//		numbers.insert(6);
//		System.out.println(numbers.size());
////		numbers.remove();
////		System.out.println(numbers.size());
//		
//		
//		numbers.insert(7);
//		numbers.print(); System.out.println( "--------------------------");
////		numbers.removeAt(3);
//		numbers.update(3,32);
//		numbers.print();
//		System.out.println(numbers.size());
		
		Array<String> names = new Array<>(3);
		names.insert("John");
		names.insert("dom");
		names.insert("lucifer");
		names.insert("linkon");
		names.printWithIndex();
		names.insert(1, "dargo");
		System.out.println("++++++++++++++++++++++++");
		names.reverse();
		names.printWithIndex();
//		names.print();
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
// insert in specfic place
// find max
// reverse

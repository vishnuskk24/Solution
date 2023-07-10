package ArraysList;

public class Tester {

	public static void main(String[] args) {
		
		Array<Integer> numbers = new Array<>(4);
		System.out.println(numbers.size() + " Size");
		numbers.insert(5);
		numbers.insert(4);
		numbers.insert(3);
		numbers.insert(2);
		numbers.insert(1);
		numbers.insert(2);
		numbers.insert(3);
		
		numbers.print();
		System.out.println(numbers.size() + "Size");
		System.out.println(numbers.indexOf(4));
		
	}
}

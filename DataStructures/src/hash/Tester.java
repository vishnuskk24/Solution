package hash;

public class Tester {

	
	public static void main(String[] args) {
		
		BasicHash<Integer> a =new BasicHash<>(100);
		
		a.add(10);
		a.add(100);
		a.add(20);
		
		a.add(30);
		a.add(130);
		a.print();
		System.out.println(a.isPresent(30));  // in these place collision is happening betweeen elements so to avoid collision we have two ways 1. seperate chaining 2. open addresing
		
		
		
	}
}

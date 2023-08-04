package map;

public class Tester {

	public static void main(String[] args) {
		HashTable<Integer,String> map = new HashTable<>();
		map.put(1, "vishnu");
		map.put(2, "Sarvana");
		map.put(null, null);
		map.replace(2, "ram");
		map.print();
		System.out.println(map.get(2));
	}
	
	
}

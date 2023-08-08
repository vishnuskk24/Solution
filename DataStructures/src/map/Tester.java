package map;

public class Tester {

	public static void main(String[] args) {
		HashTable<String,String> map = new HashTable<>();
//		map.put(1, "vishnu");
//		map.put(2, "Sarvana");
//		map.put(null, "vishnu");
//		map.put(12132242, "hello");
//		map.put(12132242, "erghello");
//		map.replace(null, "ram");
//		map.put(4, "Sarvana");map.put(4, "Sarvana");
//		map.put(6, "Sarvana");map.put(5, "Sarvana");
//		
//		map.put(7, "Sarvana");map.put(8, "Sarvana");
//		
//		map.put(9, "Sarvana");map.put(10, "Sarvana");
//		
//		map.put(11, "Sarvana");map.put(12, "Sarvana");
//		map.put(14, "Sarvana");map.put(13, "Sarvana");
		
		map.put("sarv", "Sarvana");
		map.put("khal", "drago");
		map.put("dany", "targa");
		map.put("jon", "snow");
		map.put("theon", "grey joy");
		map.put("arya", "no one");
		map.put("joffry", "mental");
		map.put("robert", "barathian");
		map.put("rob", "white wolf");
		map.put("ned", "stark");
		map.put("domnic", "lucifer");
		map.put("catlyn", "stark");
		map.put("queen", "dany");
		map.put("arthur", "sword of morning");
		map.put("king", "jon");
		map.put("king", "jon");
//		map.put("sarv", "Sarvana");map.put("khal", "drago");
//		map.put("sarv", "Sarvana");map.put("khal", "drago");
		
		
		
		map.print();
		System.out.println(map.countPairs());
//		for(int i=1;i<27;i++) {
		int i=1;
			for(String s :map.getKeySet()) {
				
//				System.out.println(i);
				System.out.println(i++ + "   "  + s + "- > \t\t\t " +s.hashCode()%i);
				
			}
//			System.out.println("===================================================================== \n\t\t\t - >"+ (i+1));
			
//		}
		
	}
	
	
}

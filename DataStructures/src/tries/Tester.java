package tries;

public class Tester {

	public static void main(String[] args) {
		Tries3 t =  new Tries3();
		
		t.insert("car");
		t.insert("care");
		t.insert("careful");
		t.insert("carefull");
		t.insert("carefully");
		t.insert("card");
		
//		System.out.println(t.getRootOfLastLetter("car"));
//		t.insert("c");chil
//		t.insert("lion");
//		System.out.println("over");
//		System.out.println(t.isPresent("cat"));
//		t.remove("cat");
//		System.out.println(t.isPresent("cat"));

//		System.out.println(t.isPresent("c"));
////		
//		System.out.println("===================");
////		t.preOrderTraversal();
//		
//		t.removeWord("c");
//		
//
//		System.out.println(t.isPresent("c"));
//		System.out.println("===================");
//		t.preOrderTraversal();

//		System.out.println("===================");
//		t.postOrderTraversal();
//		System.out.println(t.getSuggestion(" "));
//		System.out.println("Prefix -> " + " care");
//		
//		
//		for(String s : t.getSuggestion(" care")	) {
//			
//			System.out.println(s);
//		}
		
		System.out.println(t.longestCommonPrefix());
		System.out.println(t.countWords());
	}
}

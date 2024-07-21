package tries;

public class Tester {

	public static void main(String[] args) {
		Tries3 t =  new Tries3();
		
		t.insert("cat");
//		t.insert("lion");
//		System.out.println("over");
		System.out.println(t.isPresent("cat"));
		t.remove("cat");
		System.out.println(t.isPresent("cat"));
		
		
		System.out.println("===================");
		t.preOrderTraversal();

		System.out.println("===================");
		t.postOrderTraversal();
	}
}

package tries;

public class Tester {

	public static void main(String[] args) {
		Tries2 t =  new Tries2();
		
		t.insert("cat");
		t.insert("lion");
//		System.out.println("over");
		System.out.println(t.isPresent("cat"));
		t.remove("cat");
		System.out.println(t.isPresent("cat"));
	}
}

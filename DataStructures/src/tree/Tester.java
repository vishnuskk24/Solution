package tree;

public class Tester {

	public static void main(String[] args) {
		BinaryTree<Integer> b = new BinaryTree<>();
		b.insert(7);
		b.insert(4);
		b.insert(9);
		b.insert(1);
		b.insert(6);
		b.insert(8);
		b.insert(100);
		b.insert(101);
		b.insert(105);
		b.insert(107);
		
		b.insert(104);
		b.insert(102);
		System.out.println("done");
		System.out.println(b.find(107));
	}
}

//				7
//			4		9
//			
//		1     6   8     10
//							100
//								   101
//										105
//								   104				107
//							102
								
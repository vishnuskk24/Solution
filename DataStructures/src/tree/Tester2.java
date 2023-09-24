package tree;

public class Tester2 {

	
	public static void main(String[] args) {
		AVLTree<Integer> b = new AVLTree<>();
		b.insert(7);
		b.insert(4);
		b.insert(9);
		b.insert(1);
		b.insert(6);
		b.insert(8);
		b.insert(10);
//		System.out.println(b.contains(00));
		System.out.println(b.getHeight());
//		b.insert(-4);
		b.insert(-2);
//		b.insert(-3);
//		b.insert(-1);
		System.out.println(b.isBalanced());
		
//		    7
//		4		9
//		
//	1     6   8     10
	}
}

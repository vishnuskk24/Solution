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
		b.insert(10);
//		b.insert(0);
//		b.insert(-1);
//		b.insert(5);
//		
		b.insert(100);
//		b.insert(90);
//		b.insert(110);
//		b.insert(-1);
		
//		b.insert(20);
//		b.insert(10);
//		b.insert(30);
//		b.insert(6);
//		b.insert(11);
//		b.insert(18);
//		b.insert(3);
//		b.insert(3);b.insert(8);b.insert(26);
		
//		b.insert(101);
//		b.insert(105);
//		b.insert(107);
//		b.insert(104);
//		b.insert(-2);
//		b.insert(-3);
//		b.insert(-5);
//		b.insert(102);
		
//		System.out.println("done");
//		System.out.println(b.find(107));
//		b.traversePreOrder();
//		b.traverseInOrder();
//		b.traversePostOrder();
//		System.out.println(b.heightOfTheTree(7));
//		System.out.println(b.heightOfRootNode());
//		System.out.println(b.min());
		
		BinaryTree<Integer> b1 = new BinaryTree<>();
//		b1.insert(7);
//		b1.insert(4);
//		b1.insert(9);
//		b1.insert(1);
//		b1.insert(6);
//		b1.insert(8);
//		b1.insert(100);
//		System.out.println(b1.find(8));
//		System.out.println(b.isBinarySearchTree());
		
//		System.out.println(b.equal(b1));
//		for(Integer value  : b.kthNodeFromRoot(4)) {
//			System.out.print(value + " ");
//		}
//		b.levelOrderTravesal();
//		b1.insert(3);
//		b1.countLeaves();
//		b.countLeaves();
//		System.out.println(b.max());
//		System.out.println(b.isSiblings(1, 6));
		System.out.println(b1.contains(-1));
	}
}

//				7
//			4		9
//			
//		1     6   8     10
//	 0		5				100
//-1								 

//									101
//	-2									105
//		-3						   104				107
//		-5					102
								
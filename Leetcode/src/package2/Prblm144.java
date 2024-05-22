package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm144 {

//	https://leetcode.com/problems/binary-tree-preorder-traversal/
	  List<Integer> vals = new ArrayList<>();
	    public void preOrder(TreeNode tree){
	        if(tree==null){
	            return;
	        }
	        vals.add(tree.val);
	        preOrder(tree.left);
	        preOrder(tree.right);

	    }
	    public List<Integer> preorderTraversal(TreeNode root) {
	        preOrder(root);
	        return vals;
	    }
}

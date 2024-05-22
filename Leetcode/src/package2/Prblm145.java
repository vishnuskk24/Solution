package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm145 {
//	https://leetcode.com/problems/binary-tree-postorder-traversal/

	
	List<Integer> vals = new ArrayList<>();
    public void postOrder(TreeNode tree){
        if(tree==null){
            return;
        }   
        postOrder(tree.left);
        postOrder(tree.right);
        
        vals.add(tree.val);
        
    

    }
	public List<Integer> postorderTraversal(TreeNode root) {
	    postOrder(root);
	        return vals;
	}
}

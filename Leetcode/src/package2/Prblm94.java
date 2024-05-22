package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm94 {

	 List<Integer> result =  new ArrayList<>();
	    public void inorder(TreeNode tree){
	        
	        if(tree==null){
	           return;
	        } 
	        inorder(tree.left);
	        result.add(tree.val);
	        inorder(tree.right);
	      
	    }
	    public List<Integer> inorderTraversal(TreeNode root) {
	        inorder(root)   ;
	        return result;
	    }
}

package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm173 {

	 List<Integer> nums = new ArrayList<>();
	    int counter=0;

	    public void loadNum(TreeNode tree){

	        if(tree == null){
	            return;
	        }

	        loadNum(tree.left);
	        nums.add(tree.val);
	        loadNum(tree.right);
	    }

	    public BSTIterator(TreeNode root) {
	        //  TREE - > LIST  - > 
	        loadNum(root);

	    }
	    
	    public int next() {
	        return nums.get(counter++);
	        
	    }
	    
	    public boolean hasNext() {
	        return counter<nums.size();
	    }
}

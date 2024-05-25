package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm589 {

	 List<Integer> nums = new ArrayList<> ();
	    public void load(Node root){

	        if(root==null){
	            return;
	        }
	        nums.add(root.val);
	        for(Node n : root.children){
	            load(n);
	        }

	    }
	    public List<Integer> preorder(Node root) {
	        load(root);

	        return nums;
	    }
}

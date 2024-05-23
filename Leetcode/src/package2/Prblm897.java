package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm897 {

//	10,30,524
    List<Integer> nodes =  new ArrayList<>();
    
    public void load(TreeNode tree)
    {
        if(tree==null){
            return;
        }
        load(tree.left);
        nodes.add(tree.val);
        load(tree.right);
    }
	public TreeNode increasingBST(TreeNode root) {
	if(root==null || root.left==null && root.right==null) return root;
	
	    load(root);
	    // TreeNode head = nodes.get(0);
	    // TreeNode current = nodes.get(0);
	    // System.out.println(current.val  +" < - before for");
	  
	    TreeNode head = root.right;
	    TreeNode current = head;
	    for(Integer t : nodes){
	        current.right = new TreeNode(t,null,null);
	        current.left=null;
	        current=current.right;
	    } 
	   current = head.right;
	   while(current!=null){
	    System.out.println(current.val);
	    current=current.right;
	   }
	    
	    return head.right;
	}
}

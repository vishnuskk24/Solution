package package2;

import java.util.ArrayList;
import java.util.List;

public class Prblm114 {

	
	 List<TreeNode> nodes = new ArrayList<>();

	    public void loadList(TreeNode tree){
	        if(tree==null){
	            return;
	        }
	        nodes.add(tree);
	        loadList(tree.left);
	        loadList(tree.right);
	        
	    }
	    void printTree(TreeNode t){
	        if(t==null){
	            return;
	        }
	        System.out.println(t.val);
	        printTree(t.left);
	        printTree(t.right);
	    }

	    public void flatten(TreeNode root) {
	        if(root==null || (root.left==null && root.right==null)){
	            return;
	        }
	        loadList(root);
	        // nodes.foreach((x)-> System.out.println(x.val));
	        // for(TreeNode t : nodes){
	        //     System.out.println(t.val);

	        // }
	        TreeNode current=root;
	        // root.left=null;
	        for(int i=1 ;i<nodes.size();i++){
	            
	            current.right = nodes.get(i);
	            // System.out.println("adding - > " + current.val);
	            current.left=null;
	            current=current.right;
	        }
	        // printTree(root);
	    }
}

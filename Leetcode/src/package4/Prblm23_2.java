package package4;

import package4.Prblm236.TreeNode;

public class Prblm23_2 {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	class Solution {
	    
	    public TreeNode getCA(TreeNode root, TreeNode p, TreeNode q){

	        //call left
	        if(root==null) return null;
	        if(root.val==p.val) return p;
	        else if(root.val==q.val) return q;
	        else{

	            TreeNode left = getCA(root.left, p ,q);


	        // call right
	            TreeNode right =  getCA(root.right,p,q);
	            if(left==null && right==null) return null;
	            if(left==null) return right;
	            if(right==null) return left;

	            return root;
	        }

	        

	        

	    }
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        

	        return  getCA(root,p,q);




	    }
	}
}

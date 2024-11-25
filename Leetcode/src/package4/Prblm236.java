package package4;

import java.util.ArrayList;
import java.util.List;

public class Prblm236 {
	
//	   Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	   }
	 

class Solution {
    public void getCA(List<TreeNode> ds, List<List<TreeNode>> rst, TreeNode root, TreeNode target){

        if(root==null){
            return;

        }
         ds.add(root);
        if(root.val==target.val){

        //     System.out.println("Target - > " + target.val);
        //     System.out.println("                    ");
        //      for(TreeNode t : ds){
        //         System.out.println(t.val);
        // }
        // System.out.println("                    ");
            rst.add(new ArrayList<Prblm236.TreeNode>(ds));
            // ds=null;
            return;
        }else{
           
            getCA(ds,rst,root.left,target);
            getCA(ds,rst,root.right,target);
        }
    ds.remove(ds.size()-1);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        

        List<List<TreeNode>> path11=new ArrayList();
        getCA(new ArrayList(),path11,root,p);
       List<List<TreeNode>> path22=new ArrayList();
        getCA(new ArrayList(),path22,root,q);

        List<TreeNode> path1 = path11.get(0);
        List<TreeNode> path2 = path22.get(0);

        TreeNode lca = root;

        int p1=0;
        // int p2=0;
//         for(TreeNode t : path1){
//                 System.out.println(t.val);
//         }
// System.out.println("=================");

// System.out.println(path11.size() + " size   (1)")
// System.out.println(path22.size() + " size   (2)")
        
        // for(TreeNode t : path2){
        //         System.out.println(t.val);
        // }
        // System.out.println(path1);
        // System.out.println(path2);
        //  System.out.println((path1.size()<p1 ) +" " +  (path2.size()<p1) +" " + (path1.get(p1).val==path2.get(p1).val));
        while(path1.size()>p1 && path2.size()>p1 &&path1.get(p1).val==path2.get(p1).val){

            
            lca = path1.get(p1);
            p1++;
            // System.out.println(p1 + " ------");
        //    System.out.println((path1.size()<p1 ) +" " +  (path2.size()<p1) +" " + (path1.get(p1).val==path2.get(p1).val));
        }

        return lca;





    }
}
}

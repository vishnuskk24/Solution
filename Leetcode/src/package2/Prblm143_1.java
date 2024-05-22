package package2;

public class Prblm143_1 {
//  solved using stack 
//	https://leetcode.com/problems/reorder-list/submissions/
	 public void reorderList(ListNode head) {
	        if(head==null || head.next==null){
	            return;
	        }
	        ListNode slow = head;
	        ListNode fast = head;
	        int counter= 0;
	        while(fast!=null && fast.next!=null){
	            counter++;
	            slow= slow.next;
	            fast=fast.next.next;
	        }
	        System.out.println(counter);
	        Stack<ListNode> nodes= new Stack();
	        ListNode node =head;
	        while(node!=null){

	            nodes.push(node);
	            node=node.next;
	        }
	        ListNode current=head;
	        while((fast==null && counter>1)|| (fast!=null&&counter>0)){
	            ListNode temp = current.next;
	            ListNode fromLast = nodes.pop();
	            current.next=fromLast;
	            fromLast.next= temp;
	            current =temp;

	            counter--;
	        }
	        
	        if(fast==null){
	            current.next.next=null;
	        }else{
	            current.next=null;
	        }

	   
	    }
}

package package2;

import java.util.Stack;

public class Prblm445 {


//			9,22,670
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        Stack<Integer> st1 =  new Stack();

	        Stack<Integer>  st2= new Stack();

	        ListNode current = l1;

	        while(current!=null){
	            st1.push(current.val);
	            current=current.next;
	        }
	        current=l2;
	         while(current!=null){
	            st2.push(current.val);
	            current=current.next;
	        }
	        ListNode result = null;

	        
	                int rem=0;
	              
	        while(!st1.isEmpty() || !st2.isEmpty()){
	               int sum=0;
	                if(!st1.isEmpty() && !st2.isEmpty()){
	                  
	                    sum=rem+st1.pop()+st2.pop();
	                    rem=0;
	                    rem = sum/10;
	                  
	                    
	                }else if(!st1.isEmpty()){
	                  sum=rem+ st1.pop();
	                   
	                   rem=0;
	                    rem = sum/10; 
	                }else if(!st2.isEmpty()) {
	                    sum=rem+ st2.pop();
	                   rem=0;
	                    rem = sum/10;
	                }
	                 sum%=10;
	                ListNode temp =  result;
	                result=new ListNode(sum);
	                result.next=temp;
	                sum=0;
	        }
	        if(rem!=0){
	             ListNode temp =  result;
	                result=new ListNode(rem);
	                result.next=temp;
	        }
	        return result;
	    }
}

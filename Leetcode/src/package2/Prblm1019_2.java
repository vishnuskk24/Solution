package package2;

import java.util.Stack;

public class Prblm1019_2 {
	
	public int[] nextLargerNodes(ListNode head) {
	       ListNode current = head;
	        int size=0;
	       while(current!=null){
	            size++;

	            current=current.next;
	       }

	       int[] arr = new int[size] ;
	        current=head;
	        int index=0;
	        System.out.println(size + " < - size");
	      while(current!=null){
	        arr[index] = current.val;
	        index++;
	        current = current.next;
	      }

	    current=head;
	    index=0;
	    int[] result = new int[size];
	    Stack<Integer> st =  new Stack();

	     for(int i=0;i<size;i++){

	        while(!st.isEmpty() && arr[st.peek()]<arr[i]){
	                result[st.pop()] = arr[i];
	        }
	        st.push(i);
	     }
	       return result;

	    }   

}

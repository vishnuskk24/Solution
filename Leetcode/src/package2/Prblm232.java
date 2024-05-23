package package2;

import java.util.Stack;

public class Prblm232 {

	
	 Stack<Integer> st1 =  new Stack();
	    Stack<Integer> st2 =  new Stack();

	    public MyQueue() {
	        
	    }
	    
	    public void push(int x) {

	        while(!st1.isEmpty()){
	            st2.push(st1.pop());
	        }
	        st1.push(x);
	        while(!st2.isEmpty()){
	            st1.push(st2.pop());
	        }

	    }
	    
	    public int pop() {
	        return st1.pop();
	    }
	    
	    public int peek() {
	        return st1.peek();
	    }
	    
	    public boolean empty() {
	        return st1.isEmpty();
	    }
}

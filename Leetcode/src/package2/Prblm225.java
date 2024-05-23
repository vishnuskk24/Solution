package package2;

import java.util.LinkedList;
import java.util.Queue;

public class Prblm225 {

	   Queue<Integer> q1 = new LinkedList()<>();
	    Queue<Integer> q2 =new LinkedList<>();
	    public MyStack() {
	        
	    }
	    
	    public void push(int x) {
	        while(!q1.isEmpty()){
	            q2.add(q1.poll());
	        }
	        q1.add(x);
	        while(!q2.isEmpty()){
	            q1.add(q2.poll());
	        }

	    }
	    
	    public int pop() {
	        return q1.remove();
	    }
	    
	    public int top() {
	        return q1.peek();
	    }
	    
	    public boolean empty() {
	        return q1.isEmpty();
	    }
}

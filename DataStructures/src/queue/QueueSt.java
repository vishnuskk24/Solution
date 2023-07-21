package queue;

import Stack.Stack;

public class QueueSt<T> implements Queue<T> {

	
//	in these implementation we are implementing the queue using two stack //  in these we are using dynamic stack  it dont have fixed size
	private Stack<T> stack1;
	private Stack<T> stack2;
	
	public QueueSt(){
		stack1=new Stack<>();
		stack2=new Stack<>();
		
	}
	
//	private void checkEmpty1() {
//		if(stack1.isEmpty()) {
//			throw new IllegalStateException("Queue is Empty");
//		}
//	}
	private  void revertTransfer() {
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	private void checkEmpty2() {
		if(stack2.isEmpty()) {
			throw new IllegalStateException("Queue is Empty");
		}
	}
	
	private void transfer() {
		
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		transfer();
		
		return stack2.isEmpty();
	}

	@Override
	public T peek() {
		transfer();
		checkEmpty2();
		
		// TODO Auto-generated method stub
		return stack2.peek();
	}

	@Override
	public void enQueue(T value) {
		revertTransfer();
		stack1.push(value);
		// TODO Auto-generated method stub
		
	}

	@Override
	public T deQueue() {
		// TODO Auto-generated method stub
//		checkEmpty1();
		transfer();
		checkEmpty2();
		
		return stack2.pop();
	}

	@Override
	public Integer size() {
		// TODO Auto-generated method stub
		transfer();
		checkEmpty2();
	
		return stack2.size();
	}

}

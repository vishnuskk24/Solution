package queue;

public interface Queue<T> {

	
	public boolean isFull();
	public boolean isEmpty();
	public T peek() ;
	public void enQueue(T value);
	public T deQueue();
	public Integer size();
	
}

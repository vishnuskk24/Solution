package Stack;

public interface Stack<T> {

	public boolean isEmpty();
	public void push(T value);
	public  T  pop() ;
	public Integer search(T value);
	public boolean isPresent(T value) ;
	public T peek();
	public void print() ;
	public void printWithIndex();
	public boolean isFull();
	public Integer size(); 
}

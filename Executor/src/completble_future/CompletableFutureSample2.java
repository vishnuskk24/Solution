package completble_future;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureSample2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Supplier<Integer> task = ()->{
			 System.out.println("task is performed by "+ Thread.currentThread().getName());
			 return (int) (Math.random()*10);
		};
		
		for(int i=0;i<5;i++) {
		
		var future =	CompletableFuture.supplyAsync(task); //  using supplier we are providing the 
		
		System.out.println(future.get() );//  currently it is bocking main thread until the all task have to be executed by completeablf future  later we will go throught another methods  supports Async prgramming
		}
		
		System.out.println("Over");
	}
}

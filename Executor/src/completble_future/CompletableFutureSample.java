package completble_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Runnable task = ()->{
			 System.out.println("task is performed by "+ Thread.currentThread().getName());
		};
		
		for(int i=0;i<5;i++) {
		
		var future =	CompletableFuture.runAsync(task);
		
		future.get(); //  currently it is bocking main thread until the all task have to be executed by completeablf future  later we will go throught another methods  supports Async prgramming 
		}
		
		System.out.println("Over");
	}
}

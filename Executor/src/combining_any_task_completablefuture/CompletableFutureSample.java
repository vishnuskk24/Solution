package combining_any_task_completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BiFunction;

public class CompletableFutureSample {
	


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// task one getting the product price in usd
		
		// runing three task to get the output concurrently
		
		ForkJoinPool pool =  ForkJoinPool.commonPool();
		
	
	var first = CompletableFuture.supplyAsync(()->{
		BigTask.simulate();
		return 20;
		});  
	var third = CompletableFuture.supplyAsync(()-> 50); 
	var second = CompletableFuture.supplyAsync(()->{
		BigTask.simulate();
		return 30;
		});  
	
		
		
//	above three task will run async manner which task is executes first that task output will be gien to the accept method
	/// we will wait for the all task to complete once it is done we will combine them
	var all =CompletableFuture.anyOf(first,second,third);
	
		all.thenAcceptAsync(System.out::println);
		
//		System.out.println("main thread");
//		
		Thread.sleep(2000);
	
		}

}

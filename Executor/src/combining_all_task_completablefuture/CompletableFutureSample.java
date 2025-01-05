package combining_all_task_completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BiFunction;

public class CompletableFutureSample {
	


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// task one getting the product price in usd
		
		// runing three task to get the output concurrently
		
		ForkJoinPool pool =  ForkJoinPool.commonPool();
		
	
	var first = CompletableFuture.supplyAsync(()->20);  
	var second = CompletableFuture.supplyAsync(()-> 30); 
	var third = CompletableFuture.supplyAsync(()-> 50); 
		
		

	/// we will wait for the all task to complete once it is done we will combine them
	var all =CompletableFuture.allOf(first,second,third);
	
	all.thenRunAsync(()->{
		// once all task done then we are combinineg the task
//		System.out.println(Thread.currentThread().getName());
		// chaining all the task one by one and at the end we are pring the output
		// here we simply using the number
//		but if we want to download file into multiple chunks and at the end we want to join in that case we can use for loop and inside the for loop we can combing to get the result in iterative manner
		try {
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()  + "fter slep");
			System.out.println(pool.getPoolSize()+" < -- pool size");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		first.thenCombineAsync(second, (a,b)->a+b).thenCombineAsync(third, (a,c)->(a+c)+Thread.currentThread().getName()).thenAcceptAsync(System.out::println);
		
		
	});
	
	System.out.println("main thread");
	Thread.sleep(7000);
	
	
		}
}

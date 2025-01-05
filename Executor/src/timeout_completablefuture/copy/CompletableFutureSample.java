package timeout_completablefuture.copy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

public class CompletableFutureSample {
	


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	
		
	 // let sy we are running the task to get the wether result and we are giving the deadline to complete the task 
//		so if the  task taking more time in that case either our code will throw exception or it will provide defult value
		
	var first = CompletableFuture.supplyAsync(()->{
		BigTask.simulate();
		return 20;
		});  
	
	
	
//	first.orTimeout(1, TimeUnit.SECONDS).get();  // the orTimeout will thow exception and we will get the exception using get method
	// 
//	HANDLING THE EXCEPTINO USIG EXCEPTIONALLY
	
//	way 1
//	first.orTimeout(1, TimeUnit.SECONDS).exceptionally((ex)->1).thenAccept(System.out::println);
	
//	way 2
//	                    completeOnTime(default value, duetime, unit)
	first.completeOnTimeout(2, 1, TimeUnit.SECONDS).thenAccept(System.out::println);
	
	
	Thread.sleep(2000);
	}
		
	
}

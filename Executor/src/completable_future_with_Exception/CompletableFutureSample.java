package completable_future_with_Exception;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
//		try {
			
			var future = CompletableFuture.supplyAsync(()->{
				
				System.out.println("Line 12 execution");
				throw new IllegalStateException("Abc");
			});
			
			
			// handling the Exception
//			System.out.println(future.get());  // if any exception occured then the get method will get the exception from the future
			System.out.println(future.exceptionally(ex -> 400).get()); // if any exception occured the Exceptionally will map to some value like default value
			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		

	}
}

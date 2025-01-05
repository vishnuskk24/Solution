package completable_future_with_completion;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture.supplyAsync(()->1).thenRun(()->{
		System.out.println("Task  will exeute after completion  executed by -> " + Thread.currentThread().getName());
		});
		
		
		CompletableFuture.supplyAsync(()->1).thenRunAsync(()->{ //  will be executed by worker thread  used for background process like downloading / mergingfile
		System.out.println("Task  will exeute after completion  executed by -> " + Thread.currentThread().getName());
		});
		
		
		CompletableFuture.supplyAsync(()->1).thenAccept ((a)->{ //  will be accepted by main thread   main thread will be block and the accept block will be exeuted by main
			System.out.println( a + " Task  will accepted after completion  executed by -> " + Thread.currentThread().getName());
			});
			
		CompletableFuture.supplyAsync(()->1).thenAcceptAsync ((a)->{ //  will be accepted by worker thread  used for background process like downloading / mergingfile
			System.out.println( a + " Task  will accepted after completion  executed by -> " + Thread.currentThread().getName());
			});
	}
}

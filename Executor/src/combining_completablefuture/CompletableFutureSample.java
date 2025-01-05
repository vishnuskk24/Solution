package combining_completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;

public class CompletableFutureSample {
	


	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// task one getting the product price in usd
		
		
		CompletableFuture<Integer> first = CompletableFuture.supplyAsync(()->20);  // getting the prodct prince in usd
		CompletableFuture<Double> second = CompletableFuture.supplyAsync(()-> 0.9); //  getting the euro price per doller
		
		
		// converting the dollar to euro                  unwraped and both will be in the form of integer and double not in the form of completable future
		BiFunction<Integer, Double, Double> combiningtask = (price,exRate)-> price*exRate;
//		now we have to combine both the result and we have to provie new result
		// take two output and we are providing taks also what to do with two values
//		in the combing task the both the values are unwrapped and they will in the form of integer and double
		first.thenCombineAsync(second, combiningtask).thenAccept(System.out::println);
		
		
		Thread.sleep(2000);
		
		
//		in above all the operation is done using worker thread from the pool so there is no scnerio than main thread is blocked
		
//		simplified version of code
		
		var first1  =  CompletableFuture.supplyAsync(()->20);
		var second1 =  CompletableFuture.supplyAsync(()->0.9);
		
		first.thenCombine(second, (price, exRate)-> price*exRate).thenAccept((a)->System.out.println("The product price in euro -> " +a ));
		
//		at the end we can conver the product in the result in async manner
		
		// let say the task one is returning the value in form of string in that case we have to do some changes(apply some changes )
		
		var first2  =  CompletableFuture.supplyAsync(()->"20USD")
				.thenApplyAsync((price)->{  // we are appying some changes to the result
					
				price =	price.replace("USD", "");
					return Integer.parseInt(price);
				});
		var second2 =  CompletableFuture.supplyAsync(()->0.9);
		                                                                        // handling the exception if any occured we re providing some defult value
		var rst =first2.thenCombine(second2, (price, exRate)-> (price*exRate)+Thread.currentThread().getName()).exceptionally((ex)->10.0+"").thenAcceptAsync((a)->System.out.println("The product price in euro: -> " +a ));
		
//		rst.get();
		Thread.sleep(4000);
		
		
	
		}
}

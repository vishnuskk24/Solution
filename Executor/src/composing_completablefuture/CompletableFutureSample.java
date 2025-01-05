package composing_completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSample {
	
	public static String getEmail(int id) {
		
		// going db getting the email by using the id
		
		return "abc@gmail.com";
	}

	public static CompletableFuture<String> getplaylist(String email){
		return CompletableFuture.supplyAsync(()-> email + "playlist"); // retrive the playlist of the user using email
	}
	
	public static CompletableFuture<String> getEmailAsync(int id){
		return CompletableFuture.supplyAsync(()->getEmail(id));
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		int id =11;
		
		 //  getting the email using id in asynchronus fashion
		getEmailAsync(id)
			.thenCompose((email)->getplaylist(email)) // composing (doing some operaition) from the previous operation output to get the playlist
			.thenAcceptAsync(System.out::println);// final operation  to notify user
		
		Thread.sleep(2000);
//		in all above scenario we are doing the tas in Asynchrous fashion so our main thread will just trigger the worker therad from the thread pool and to do the operation
//		in the meantime the main thread is not blocked and it can handle user

		
//		simplified version
		
		getEmailAsync(id)
		.thenComposeAsync((email)->getplaylist(email)) // composing (doing some operaition) from the previous operation output to get the playlist
		.thenAcceptAsync(System.out::println);// final operation  to notify user
	
	Thread.sleep(2000);
	}
}

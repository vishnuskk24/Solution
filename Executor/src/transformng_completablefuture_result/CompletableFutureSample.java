package transformng_completablefuture_result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSample {
	
	
	public static int tofahrenheit(int celcius) {
		
		return (int) ((celcius*1.8)+32);
		
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// TRANSFORMING THE OUTPUT FROM supplyAsync  usng the thenApply() method  -> takes fuctional type
		
//		let say we got some foutput from the Competablefuture now we want to convert to some value
		
//		let say we requsted an api to get the tempuraturre and it is in form of celcius so now i have to convert into  faranhed 
		
//		 for that we have then apply method to update the alue it is similiar to the map functin in the streams
		
		CompletableFuture.supplyAsync(()-> 32) // got the tempurature from the api 
		.thenApply((celcius)-> (celcius*1.8)+32)  // once you got the temp in celcius then update to fahrenheit
		.thenAccept((fahrenheit)-> System.out.println(fahrenheit));
		
		
//		print the value
		
		
//		simplified version

		CompletableFuture.supplyAsync(()-> 32) // got the tempurature from the api 
		.thenApply(CompletableFutureSample::tofahrenheit)  // once you got the temp in celcius then update to fahrenheit
		.thenAccept(System.out::println);
		
		
		
		

	}
}

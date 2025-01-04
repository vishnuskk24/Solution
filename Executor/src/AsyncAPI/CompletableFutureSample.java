package AsyncAPI;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		MailSender mail =  new MailSender();
		
		
		mail.sendAsync(); // this asn method trigger the completableFuture so it will run the task in Async manner so main thread will simple execute the next statements 
		System.out.println("Over");
		Thread.sleep(4000);
	}
}

package AsyncAPI;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MailSender  {

	public void send() {
		BigTask.simulate();
		System.out.println("Mail sent.." +  Thread.currentThread().getName());
	}
	
	public CompletableFuture<Void> sendAsync() {
		Runnable r =()->send();
		return 	CompletableFuture.runAsync(r);
	}
	
}

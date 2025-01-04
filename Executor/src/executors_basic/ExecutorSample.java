package executors_basic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSample {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ExecutorService executor =  Executors.newFixedThreadPool(3);
		
		List<Future<?>> list =  new ArrayList<>();
		try {
			
			for(int i=0;i<10 ;i++) { // creating the 0 thread to download file into 10 chunck of the data
				
				Future<?> val =executor.submit(new DownloadFile(i, 0,10)); // so far we are manualy hard coding th statr and end of chunck of data i needs a calculation
				list.add(val);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			executor.shutdown();  // we have to shut down the executor service once all the task is executed 
		}
		
			for(Future<?> f: list) f.get(); //  this like makes the main thread to wait util the executor complete its task using the give thread
//		executor
		System.out.println("Download completed");
	}
	// Drawback -> in runnable we can only Exeute the task  but in our case if the task want to return some data in that case we have to  use callable	
}

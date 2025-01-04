package callable_and_future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSample {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		
		int noOfParts =4;
		ExecutorService Ex = Executors.newFixedThreadPool(noOfParts);
		
		List<Future<Integer>> output =  new ArrayList<>();
		
		try {
			for(int i=0 ;i<noOfParts ;i++) {
				
				Future<Integer> val = Ex.submit(new DownloadFile(i, noOfParts, i));
				
				output.add(val);
				
			}
			
			// with hellp of future we are making the main thread to wait until its all the task is completed but Executor service
			
			for(Future<Integer> f : output) System.out.println( "Output of the each thread" +f.get()); // if we are downloading file in that case we have join the all chunck of datainstead of printing
			// here in out scenario we are making the main thread to wait fo all that task to be complete d by t executor service so if it is an applicatio having ui I that case out main thread have to do the downalod process and it have to interact with user also 
			
//			so  in that case we have to use Async programming -> we are not suppose to block out main thread
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			Ex.shutdown();
		}
		System.out.println("File downloaded successfully");
	}

}

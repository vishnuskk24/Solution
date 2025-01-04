package callable_and_future;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DownloadFile implements Callable<Integer> {

	
	int chunckNumber ;
	int start;
	int end;
	public DownloadFile(int i, int start, int end) {
		this.chunckNumber = i;
		this.start =start;
		this.end=end;
		// TODO Auto-generated constructor stub
	}
// in this case we are returning the integer but in real scenario we have to return the file reference  that we downaloaded
	public int downloadFile() {
		
		// download code
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Downloading file  --> " + Thread.currentThread().getName());
		
			return (int) (Math.random()*10000);
		
	}

	

	@Override
	public Integer call() throws Exception {
		 return downloadFile(); // once the task executed it have to return the value to the Executor where we called the submit method
	
	}
	
}

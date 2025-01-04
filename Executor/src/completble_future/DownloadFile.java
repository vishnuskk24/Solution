package completble_future;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DownloadFile implements Runnable {

	
	int chunckNumber ;
	int start;
	int end;
	public DownloadFile(int i, int start, int end) {
		this.chunckNumber = i;
		this.start =start;
		this.end=end;
		// TODO Auto-generated constructor stub
	}

	// in real scenario either we can pass the reference int param and we store it in the param refernce if we want to return in that case we can use callabe interface instead runnable 
	public void downloadFile() {
		
		// download code
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Downloading file  --> " + Thread.currentThread().getName());
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		downloadFile();
		
	}
	
}

package adders;

import java.util.ArrayList;
import java.util.List;

public class ActiveThread {
	
	public static void executeThread() throws InterruptedException {
		
		System.out.println(Thread.activeCount()+" <- active threads");
		System.out.println(Runtime.getRuntime().availableProcessors()+" available process in my system");
		
		List<Thread> threads = new ArrayList<>();
		DownloadStatus status = new DownloadStatus();
		for(int i=0;i<10;i++){
			Thread t1 = new Thread(new DownloadFile(status));
			threads.add(t1);
//			
			
			t1.start();
			
			
		}
		for(Thread t : threads)t.join();//  stating the main thread have to wait until all thread to complete that is mentioned in the list
		 
		System.out.println(status.getTotalBytes()+ "<- total bytes");
		
	
		System.out.println("Download complete "+ Thread.currentThread().getName());
		
		
		System.out.println(Thread.currentThread().getName()+" current thread");
	}

	public static void main(String[] args) throws InterruptedException {
//		 to get an active theread
		
//		use Thread.getActivecount()
		
		executeThread();
		
		
	}
}

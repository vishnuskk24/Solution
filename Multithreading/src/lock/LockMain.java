package lock;

import java.util.ArrayList;
import java.util.List;

public class LockMain {
	
	public static void executeThread() throws InterruptedException {
		
		System.out.println(Thread.activeCount()+" <- active threads");
		System.out.println(Runtime.getRuntime().availableProcessors()+" available process in my system");
		
		List<Thread> threads = new ArrayList<>();
		DownloadStatus status = new DownloadStatus();
		for(int i=0;i<100;i++){
			Thread t1 = new Thread(new DownloadFile(status)); // sharing the common resource to the each thread
			threads.add(t1);

			
			t1.start();
			
		}
		for(Thread t : threads)t.join();//  stating the main thread have to wait until all thread to complete that is mentioned in the list
		 
		System.out.println(status.getTotalBytes()+ "<- total bytes");
//		Thread.sleep(1000);;
		System.out.println("Download complete "+ Thread.currentThread().getName());
		
		
//		thread
		
		System.out.println(Thread.currentThread().getName()+" current thread");
	}

	public static void main(String[] args) throws InterruptedException {
//		 to get an active theread
		
//		use Thread.getActivecount()
		
		executeThread();
		
		
	}
}

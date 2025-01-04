package signaling;

import java.util.ArrayList;
import java.util.List;

public class VolaiteMain {
	
	public static void executeThread() throws InterruptedException {
		
		System.out.println(Thread.activeCount()+" <- active threads");
		System.out.println(Runtime.getRuntime().availableProcessors()+" available process in my system");
		
		List<Thread> threads = new ArrayList<>();
		DownloadStatus status = new DownloadStatus();

		Runnable r2 = ()-> {
			System.out.println("thread2 started");
			while(!status.isDone()) {
				synchronized (status) {
					
					try {
						System.out.println("line 35 while loop statrted waiting");
						status.wait();
						System.out.println("line 35 while loop");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
//				System.out.println("is executing line 32"+ status.isDone);
			}
			System.out.println("Download completed -> notifing to user "+ status.getTotalBytes());
		};
//		Thread t1= new Thread(r);
		Thread t1 = new Thread(new DownloadFile(status)); // sharing the common resource to the each thread
		Thread t2= new Thread(r2);
		t1.start(); // this thread will initiate 10 thread to download files
		t2.start(); //  this thread will check for the boolean values if it is true then in that case it will print
		
	}

	public static void main(String[] args) throws InterruptedException {
//		 to get an active theread
		
//		use Thread.getActivecount()
		
		executeThread();
		
		
	}
}

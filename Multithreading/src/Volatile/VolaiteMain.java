package Volatile;

import java.util.ArrayList;
import java.util.List;

public class VolaiteMain {
	
	public static void executeThread() throws InterruptedException {
		
		System.out.println(Thread.activeCount()+" <- active threads");
		System.out.println(Runtime.getRuntime().availableProcessors()+" available process in my system");
		
		List<Thread> threads = new ArrayList<>();
		DownloadStatus status = new DownloadStatus();
//		Runnable r= ()->{
//
//			for(int i=0;i<100;i++){
//				Thread threads1 = new Thread(new DownloadFile(status)); // sharing the common resource to the each thread
//		threads.add(threads1);
//
//		
//		threads1.start();
//				
//			}
//
//		};
//		
		Runnable r2 = ()-> {
			
			while(!status.isDone()) {
				
//				System.out.println("is executing line 32"+ status.isDone);
			}
			System.out.println("Download completed -> notifing to user "+ status.getTotalBytes());
		};
//		Thread t1= new Thread(r);
		Thread t1 = new Thread(new DownloadFile(status)); // sharing the common resource to the each thread
//		threads.add(t1);

		
//		t1.start();
		
		Thread t2= new Thread(r2);
		t1.start(); // this thread will initiate 10 thread to download files
		t2.start(); //  this thread will check for the boolean values if it is true then in that case it will print
		
//		System.out.println("making main thread to wait util ll the thread to execute"+ Thread.currentThread().getName());
//		for(Thread t : threads)t.join();//  stating the main thread have to wait until all thread to complete that is mentioned in the list
////		 t1.join();
//		System.out.println("making status to complete" + Thread.currentThread().getName());
//		status.setDone();
//		System.out.println("making main thread to wait notify thread to complete" + Thread.currentThread().getName());
//		t2.join();
//		
//		System.out.println(status.getTotalBytes()+ "<- total bytes");
////		Thread.sleep(1000);;
//		System.out.println("Download complete "+ Thread.currentThread().getName());
//		
		
//		thread
		
//		System.out.println(Thread.currentThread().getName()+" current thread");
	}

	public static void main(String[] args) throws InterruptedException {
//		 to get an active theread
		
//		use Thread.getActivecount()
		
		executeThread();
		
		
	}
}

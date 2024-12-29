package simplethread;

public class DownloadFile implements Runnable {

	DownloadStatus status;
	
	public DownloadFile(DownloadStatus status) {
		// TODO Auto-generated constructor stub
		this.status=status;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<10_000;i++) {
//			System.out.println(i);
//			if(Thread.currentThread().isInterrupted()) {
//				System.out.println(Thread.currentThread().getName()+ " is intrepted so stopped that thread");
//				return;
//			}
			status.incrementTotalBytes();
		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			 System.out.println(Thread.currentThread().getName() + " was interrupted during sleep. Stopping execution.");
//		        Thread.currentThread().interrupt(); // Re-assert the interrupt flag
//		        return; // Exit the method
//		    
//		}
		System.out.println("Download file " +  Thread.currentThread().getName());
		
//		Thread.currentThread().stop();
	}

	
}

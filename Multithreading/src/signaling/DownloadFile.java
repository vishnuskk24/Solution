package signaling;

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
		
		System.out.println("thread 1 started");
		for(int i=0;i<10_000;i++) { // each will add 1 lack to the total bytes so total ten thread so 10 lakhs  
//			System.out.println();
			status.incrementTotalBytes();
		}
		
		System.out.println("changing status");
		status.setDone();
		synchronized (status) {
			status.notifyAll();
			
		}
		
		System.out.println("Download file " +  Thread.currentThread().getName());
		
	
	}

	
}

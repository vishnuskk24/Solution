package Volatile;

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
		
		
		for(int i=0;i<10_0000;i++) { // each will add 1 lack to the total bytes so total ten thread so 10 lakhs  
//			System.out.println();
			status.incrementTotalBytes();
		}
		
		status.setDone();
		System.out.println("Download file " +  Thread.currentThread().getName());
		
	
	}

	
}

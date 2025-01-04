package atomic;

public class DownloadFile implements Runnable {

	DownloadStatus status;
	
	public DownloadFile(DownloadStatus status) {
		// TODO Auto-generated constructor stub
		this.status=status;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		
		for(int i=0;i<10_000;i++) {
		
			status.incrementTotalBytes();
		}
//		
		System.out.println("Download file " +  Thread.currentThread().getName());
		
	}

	
}

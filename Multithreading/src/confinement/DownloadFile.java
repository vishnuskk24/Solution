package confinement;



public class DownloadFile implements Runnable {

	DownloadStatus status;
	
	

	public DownloadFile() {
		// TODO Auto-generated constructor stub
		this.status=new DownloadStatus(); //  so every thread will have there own resourse in our case it is takign the own status value 
	}
//  if it is five thread in that case it will take the 5 confmnent download status and each thread will update the resourse without any concurrent issue
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		
		
		for(int i=0;i<10_000;i++) {
			
			status.incrementTotalBytes();
		}
		
		System.out.println("Download file " +  Thread.currentThread().getName());
		
//		Thread.currentThread().stop();
	}

	// getters
	public DownloadStatus getStatus() {
		return status;
	}
	
}

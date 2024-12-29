package lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

  class  DownloadStatus {
	
	private int totalBytesDownloaded;
	private Lock lock =  new ReentrantLock();
	
	public int getTotalBytes() {
		return this.totalBytesDownloaded;

	}
	synchronized public void incrementTotalBytes()
	{
		try {
			lock.lock();
			totalBytesDownloaded++;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			lock.unlock();
		}
	}
	
}

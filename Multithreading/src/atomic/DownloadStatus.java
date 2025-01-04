package atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

  class  DownloadStatus {
	boolean isdone =false;
	private AtomicInteger totalBytesDownloaded =  new AtomicInteger(); // to prevent race condition we are using atomic objects	simplethread
	
	public int getTotalBytes() {
		return this.totalBytesDownloaded.get();

	}
	synchronized public void incrementTotalBytes()
	{
		totalBytesDownloaded.incrementAndGet();
	}
	
}

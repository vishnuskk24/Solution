package Volatile;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

  class  DownloadStatus {
	
	private int totalBytesDownloaded;

	volatile boolean  isDone = false;
	
	public    boolean isDone() {
		return isDone;
	}
	public  void setDone() {
		this.isDone = true;
	}
	public int getTotalBytes() {
		return this.totalBytesDownloaded;

	}
	synchronized public void incrementTotalBytes()
	{
		
			totalBytesDownloaded++;
		
		
	}
	
}

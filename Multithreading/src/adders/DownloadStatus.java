package adders;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

  class  DownloadStatus {
	boolean isdone =false;
	private LongAdder totalBytesDownloaded =  new LongAdder(); // to prevent race condition we are using adders when we are using the multip thread that updated frequetly
//	 much faster compared to the atomic objects
//	it is bulk datatype it willl grow on demand
	public int getTotalBytes() {
		return this.totalBytesDownloaded.intValue();
			
	}
	synchronized public void incrementTotalBytes()
	{
		totalBytesDownloaded.increment();
	}
	
}

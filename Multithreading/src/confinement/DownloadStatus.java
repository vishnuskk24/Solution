package confinement;

import java.util.ArrayList;
import java.util.List;

  class  DownloadStatus {
	
	private int totalBytesDownloaded;
	
	public int getTotalBytes() {
		return this.totalBytesDownloaded;

	}
	 public void incrementTotalBytes()
	{
		totalBytesDownloaded++;
	}
	
}

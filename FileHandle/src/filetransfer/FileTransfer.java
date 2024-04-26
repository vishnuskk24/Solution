package filetransfer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileTransfer implements Runnable{

	private File sourceFile;
	private File destFile;
	private long startByte;
	private long endByte;
	
	
	 public FileTransfer(File sourceFile, File destFile, long startByte, long endByte) {
	        this.sourceFile = sourceFile;
	        this.destFile = destFile;
	        this.startByte = startByte;
	        this.endByte = endByte;
	    }

	@Override
	public void run() {
		
		try (RandomAccessFile sourceRaf =  new RandomAccessFile(sourceFile, "r");
				RandomAccessFile destRaf =  new RandomAccessFile(destFile, "rw");){
			
			sourceRaf.seek(startByte);
			 destRaf.seek(startByte);
			 byte[] buffer = new byte[512];
			 long bytesToRead = endByte-startByte; // getting range
			 int bytesRead;
			 while (bytesToRead > 0 && (bytesRead = sourceRaf.read(buffer, 0, (int)Math.min(buffer.length, bytesToRead))) != -1) {
//				 System.out.println("bytes readed - >" + bytesRead);
				 destRaf.write(buffer, 0, bytesRead);
	                bytesToRead -= bytesRead;
	            }
//	            System.out.println("File chunk transferred successfully from " + startByte + " to " + endByte);
	        
			 
			 
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

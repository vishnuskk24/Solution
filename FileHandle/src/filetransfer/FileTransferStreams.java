package filetransfer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTransferStreams {

	
	public static void main(String[] args) throws IOException {
		File f =  new File("h.txt");
		BufferedOutputStream bfout =  new BufferedOutputStream(new FileOutputStream("src/copy.txt"));
		BufferedInputStream bfin =  new BufferedInputStream(new FileInputStream(f));
		long bytesYetToRead = f.length();
		byte[] bytes = new byte[512];
		int value = bfin.read(bytes, 0,(int) Math.min(bytesYetToRead, 2048));
		while(value!=-1 && bytesYetToRead>0) {
			bfout.write(bytes, 0, value);
			bytesYetToRead= bytesYetToRead-value;
			
		}
		System.out.println("transfer done ");
		bfin.close();
		bfout.close();
	}
}

package filetransfer;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Executer {
	
	public static void main(String[] args) throws IOException {
		
		LocalDateTime start =  LocalDateTime.now();
		
		
		File sourceFile = new File("D:\\Solution\\temp\\FileTranserExercise\\VID_20211014_173513_283.mp4");
        File destinationFile = new File("D:\\Solution\\temp\\FileTranserExercise\\src\\VID_20211014_173513_283.mp4");
        if(destinationFile.exists()) destinationFile.delete();
        
        destinationFile.createNewFile();
        int numThreads = 4; // Number of threads to use
        long fileSize = sourceFile.length();
        long chunkSize = fileSize / numThreads;	
        System.out.println("Executing Thread");
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            long startByte = i * chunkSize;
            long endByte = (i == numThreads - 1) ? fileSize : (i + 1) * chunkSize;
            Thread thread = new Thread(new FileTransfer(sourceFile, destinationFile, startByte, endByte));
            thread.start();
            threads[i] = thread;
        }
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime end =  LocalDateTime.now();
        
        System.out.println(ChronoUnit.SECONDS.between(start, end));
	}

}
// thread   time   byte
//  1        17		512
//  2		 18
//  3 		 27
//  4
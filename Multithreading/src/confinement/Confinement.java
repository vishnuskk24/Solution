package confinement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Confinement {
	public static void main(String[] args) throws InterruptedException {
		
		
		List<Thread> threads=  new ArrayList<>();
		
		// this download file is an resourc	e that is provide to every thread individually so it can do the operation without any concurrency issue
		List<DownloadFile> downloadfiles =  new ArrayList<>();// list is to keep track of the resource after all the thread executed.
		for(int i=0;i<10;i++) {
			
			DownloadFile df= new DownloadFile();
			
			Thread t = new Thread( df); //  each thread created independently by having their own separate resource(i.e ) download status
			threads.add(t);
			downloadfiles.add(df);
			t.start();
			
			
			
		}
		
		for(Thread t: threads) t.join();
		
		// at the end we are adding the sum with the from the every resource we share to each thread;
		Integer totatbytes  = downloadfiles.stream().map(t->t.getStatus().getTotalBytes()).reduce(Integer::sum).get();
		System.out.println(totatbytes);
	}

}

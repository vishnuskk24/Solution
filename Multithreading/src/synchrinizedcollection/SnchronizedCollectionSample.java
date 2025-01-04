package synchrinizedcollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SnchronizedCollectionSample {

	public static void main(String[] args) {
//		Collection<Integer> arr =  new ArrayList<>();
		
//		to create sync collection we have to use synchronizedCollection() to create the synchronized collection
//		 basically it wraps the data // arraylist into an synchronized block
		
		Collection<Integer> arr =  Collections.synchronizedCollection(new ArrayList<>());
		
		Thread t1 = new Thread(()->{
			
			arr.addAll(Arrays.asList(1,2,3));
			
		});
		Thread t2 = new Thread(()->{
			
			arr.addAll(Arrays.asList(4,5,6));
			
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(arr);  // [4, 5, 6]  output for non sync collection  [1, 2, 3, 4, 5, 6] -> output foe sync colection demerit -> it lost concurrency
		
//		to resolve this isssue we will use concurrent hashmap
		
		Map<Integer, String> map1 =  new HashMap<>(); //  normall hashmap than can be accesed by ony one thread
		Map<Integer, String> map =  new ConcurrentHashMap<>(); // concurrent collection(concurrent hashmap ) helps to access by multiple threads simultaneously in multithreaded application
		

	}

}

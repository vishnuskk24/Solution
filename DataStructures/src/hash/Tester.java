package hash;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import character.Customer;

public class Tester {

	
	public static void main(String[] args) {
		
//		BasicHash<Integer> a =new BasicHash<>(100);
//		
//		a.add(10);
//		a.add(100);
//		a.add(20);
//		
//		a.add(30);
//		a.add(130);
//		a.print();
//		System.out.println(a.isPresent(30));  // in these place collision is happening betweeen elements so to avoid collision we have two ways 1. seperate chaining 2. open addresing
		
		
//		ChainedHash<String> a = new ChainedHash<>();
//		a.put(5);
//		a.put(1);
//		a.put(101);
//		
//		a.put(50);
//		
//		a.put(20);
//		
//		a.put(30);
//		
//		a.put(70);
//		a.put(90);
//		
//		a.put(190);
//		a.put(150);
//		a.put(-1);
//		
//		a.print();
		
		
//		System.out.println(a.isPresent("aabc"));
		
		ChainedHash<Customer> a = new ChainedHash<>();
		a.put(new Customer("Vishnu", 23, LocalDate.of(2000, 04, 10), 876543210l));
		a.put(new Customer("Sarv", 26, LocalDate.of(1996, 04, 10), 886543210l));
		a.put(new Customer("raj", 29, LocalDate.of(1994, 04, 10), 976543210l));
		a.put(new Customer("drago", 22, LocalDate.of(2001, 04, 10), 876543210l));
		a.print();
		
	}
}

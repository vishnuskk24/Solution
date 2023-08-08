package map;



import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import LinkedList.Linkedlist;

public class HashTable<K,V> implements Map<K, V>{

	
	 
	private class Entry<K,V>{
		private K key;
		private V value;
		
		Entry(K key , V value){
			this.key=key;
			this.value=value;
		}

		@Override
		public String toString() {
			return "Entry [key=" + key + ", value=" + value + "]";
		}
	}
	
	private Linkedlist<Entry>[] arr;
	
	
	
	public HashTable() {
		this.arr=new Linkedlist[23];
	}
	
	private Integer generateHashForUserDefined( K value) {
		int index;
		String input  = new String(value.toString());
		int total=0;
		for(char c: input.toCharArray()) {
			total+=c;
			
		}
		 index = total%arr.length;
		
		return index;
	}
	
	
	private Integer genrateHashForPreDefined(K value) {
		Integer index =( (Integer) value) %arr.length;
		index=(index<0)?-1*index:index;
		return index;
	}
	
	private boolean isUserDefined(K value) {
		
		if(value instanceof Integer || value instanceof Double || value instanceof Long || value instanceof Character || value instanceof Boolean || value instanceof Float || value instanceof Byte  ) {
		
			return false;
		}
		return true;
		
	}
	
		
	private Integer generateHash(K value ) {
		
		return isUserDefined(value)?generateHashForUserDefined(value):genrateHashForPreDefined(value);
		
	
	}
	
	private boolean isAvailable(int index) {
		
		return this.arr[index] ==null;
	}
	
	private  void addEntry(K key,V value,int index) {
		
		Linkedlist<Entry> entry=new Linkedlist<>();
		Entry e = new Entry(key, value);
//		System.out.println("adding last " + e.toString());
		entry.addlast(e);
		this.arr[index]=entry;
		
	}
	private void updateValueInList(K key,Linkedlist<Entry> chain,V value) {

		int last = chain.size();
		for(int i=0;i<last;i++) {
			Entry r = chain.get(i);
//			System.out.println(r.toString());
			if((r.key==null  && key==null) || r.key.equals(key)) {
				r.value=value;
				break;
			}
			
		}
		
		
	}
	public int getIndex(K key) {
		if(key==null) {
			return 0;
		}
		int hash = key.hashCode();
		int index = hash<0?-1*hash%arr.length:hash%arr.length;
//		System.out.println(key +" - > index -> " + index);
		return  index;
	}
	public  boolean isContains(K key) {
		if(isAvailable(getIndex(key))) {
			
		}
		Linkedlist<Entry> chain = this.arr[getIndex(key)];
		int last = chain.size();
		for(int i=0;i<last;i++) {
			Entry r = chain.get(i);
			if(r.key.equals(key)) {
//				System.out.println("is contains returning true for key - > " + key);
				return true;
			}
			
		}
//		System.out.println("is contains returining false for key  - > " + key);
		return false; 
		
	}
	private void addItToList( K key,V value) {
//		System.out.println("index is already occupied by another value for key  - > " +key);
		int index = getIndex(key);
		
		if(!isContains(key)) {
//			System.out.println(" adding the keey to linked list becoz key is not available");
			Entry e = new Entry(key,value);
//					System.out.println("Entry e - > " + e.toString());
			arr[index].addlast(e);
		}else {
			updateValueInList(key, this.arr[getIndex(key)], value);
		}
		
	}
	private V getValueFromEntryList(int index,K key) {
		Linkedlist<Entry> chain = this.arr[index];
		int last = chain.size();
		for(int i=0;i<last;i++) {
			Entry r = chain.get(i);
			if(r.key.equals(key)) {
				return (V) r.value;			}
			
		}
		return null;
		
		
	}
	private void removeEntryFromList(K key,int index) {
		
		Linkedlist<Entry> chain = this.arr[index];
		chain.remove(index);
		for(Entry e:chain.toArray() ) {
			if(key.equals(e.key)) {
				
				break;
			}
			
		}
	}
	private void iterateLinkedList(Linkedlist<Entry> chain ) {
		
		int last = chain.size();
//		System.out.print("[");
		for(int j =0 ; j<last;j++) {
			
			Entry e = chain.get(j);
//						
																		//			if(j==last) System.out.print(e.key+" = "+e.value);
						 
			System.out.println("["+e.key+" = "+e.value+"]");
		
		}
//		System.out.println("]");
	}
	@Override
	public void put(K key ,V value) {
		
		
		
		
		int index =getIndex(key);
		if(isAvailable(index)) {  // if the index is empty and null adding new linked list to the index of our array
//			System.out.println(" adding an entry  key -> " + key + "  value  - > " + value);
			addEntry(key, value, index);
//			System.out.println("adding is done by addentry for key " + key);
		}else {
//			adding the key value pair in our Existing linkedList that present in the index
//			System.out.println(" adding to list -> " + key + "  value  - > " + value);
			addItToList( key, value);
//			System.out.println("adding is done by addit to list for key " +key);
		}
//		System.out.println(arr[1].size());
		
	}
	
	@Override
	public V get(K key) {
		int index = key.hashCode()%arr.length;
		if(!isAvailable(index)) {
			
			return getValueFromEntryList(index, key);
			
		}else {
			return null;
		}
	}
	@Override
	public void remove(K key) {
		int index = key.hashCode()%arr.length;
		if(isAvailable(index)) {
			
			removeEntryFromList(key,index);
		}
	}
	@Override
	public void replace(K key , V value) {
		
		int index =getIndex(key);
		if(!isAvailable(index)) {
			
			updateValueInList(key,this.arr[index],value);
		}
	}
	
	public void print() {
		System.out.println("[");
		
		for(Linkedlist<Entry> l :arr) {
			
			if(l!=null) {
				
				iterateLinkedList(l);
			
				
			}
			
		}
		System.out.println("]");
	}

	@Override
	public Set<K> getKeySet() {
		// TODO Auto-generated method stub
		boolean flag = true;
		Set<K> keys = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==null) continue; // if that index is not used then it will be null value
			
			flag = false;
			Linkedlist<Entry> chain = arr[i];
//			 iterate chain to get keys from Entry object
			
			int last = chain.size();
			
			for(int j=0;j<last;j++) { // iterate the linked list till last  to get the key and once you got the key store it into the hashset
				Entry e =chain.get(j);
				keys.add((K) e.key);
				
			}
			
			
		}// need to continue tilll the last index of you linked list (specializd array) :)
		if(flag) keys=null; //  if no values in our hashmap than return null
		
		
		
		return keys;
	}

	@Override
	public Integer countPairs() {
		Integer totalpairs=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]== null) continue;
			
			Linkedlist<Entry> chain=arr[i];
			int last = chain.size();
			for(int j=0;j<last;j++) {
				totalpairs++;
				
			}
		}
		return totalpairs;
	}
}

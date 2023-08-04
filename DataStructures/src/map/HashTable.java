package map;

import java.util.LinkedList;

import LinkedList.Linkedlist;

public class HashTable<K,V> {

	
	 
	private class Entry<K,V>{
		private K key;
		private V value;
		
		Entry(K key , V value){
			this.key=key;
			this.value=value;
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
		entry.addlast(new Entry(key, value));
		this.arr[index]=entry;
		
	}
	private boolean isContains(K key,Linkedlist<Entry> chain,V value) {
		for(Entry r : chain.toArray()) {
			if(r.equals(key)) {
				r.value=value;
				return true;
			}
			
		}
		
		return false;
		
	}
	private void addItToList(int index , K key,V value) {
		Linkedlist<Entry> l =this.arr[index];
		if(!isContains(key, l,value)) {
			l.addlast(new Entry(key,value));
		}
		
	}
	private V getValueFromEntryList(int index,K key) {
		Linkedlist<Entry> chain = this.arr[index];
		for(Entry e:chain.toArray() ) {
			if(key.equals(e.key)) {
				return (V) e.value;
			}
			
		}
		return null;
		
		
	}
	public void put(K key ,V value) {
		
//		int index = generateHash(key);
		
		int hash = key.hashCode();
		
		int index =  hash<0?-1*hash%arr.length:hash%arr.length;
		if(isAvailable(index)) {  // if the index is empty and null adding new linked list to the index of our array
			addEntry(key, value, index);
		}else {
//			adding the key value pair in our Existing linkedList that present in the index
			
			addItToList(index, key, value);
		}
		
	}
	
	
	
	public V get(K key) {
		int index = key.hashCode()%arr.length;
		if(isAvailable(index)) {
			return getValueFromEntryList(index, key);
			
		}else {
			return null;
		}
	}
}

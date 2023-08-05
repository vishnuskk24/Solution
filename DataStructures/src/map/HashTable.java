package map;



import LinkedList.Linkedlist;

public class HashTable<K,V> implements Map<K, V>{

	
	 
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
	private void updateValueInList(K key,Linkedlist<Entry> chain,V value) {

		int last = chain.size();
		for(int i=0;i<last;i++) {
			Entry r = chain.get(i);
			if(r.key.equals(key)) {
				r.value=value;
				break;
			}
			
		}
		
		
	}
	private int getIndex(K key) {
		if(key==null) {
			return 0;
		}
		int hash = key.hashCode();
		return   hash<0?-1*hash%arr.length:hash%arr.length;
	}
	public  boolean isContains(K key) {
		if(isAvailable(getIndex(key))) {
			
		}
		Linkedlist<Entry> chain = this.arr[getIndex(key)];
		int last = chain.size();
		for(int i=0;i<last;i++) {
			Entry r = chain.get(i);
			if(r.equals(key)) {
				return true;
			}
			
		}
		
		return false;
		
	}
	private void addItToList( K key,V value) {
		int index = getIndex(key);
		if(!isContains(key)) {
			arr[index].addlast(new Entry(key,value));
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
		System.out.print("[");
		for(int j =0 ; j<last;j++) {
			
			Entry e = chain.get(j);
																		//			
																		//			if(j==last) System.out.print(e.key+" = "+e.value);
																		//			else 
			System.out.print(e.key+" = "+e.value);
		
		}
		System.out.println("]");
	}
	@Override
	public void put(K key ,V value) {
		
		
		
		
		int index =getIndex(key);
		if(isAvailable(index)) {  // if the index is empty and null adding new linked list to the index of our array
			addEntry(key, value, index);
		}else {
//			adding the key value pair in our Existing linkedList that present in the index

			addItToList( key, value);
		}
		
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
		
		int index = key.hashCode()%arr.length;
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
}

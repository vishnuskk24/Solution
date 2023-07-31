package hash;

public class BasicHash<T> {

	private T[] arr= null;
	
	private int count ;
	private boolean isUserDefined(T value) {
	
		if(value instanceof Integer || value instanceof Double || value instanceof Long || value instanceof Character || value instanceof Boolean || value instanceof Float || value instanceof Byte  ) {
		
			return false;
		}
		return true;
		
	}
	private int generateIndex(T value) {
		int index;
		String input  = new String(value.toString());
		int total=0;
		for(char c: input.toCharArray()) {
			total+=c;
			
		}
		 index = total%arr.length;
		
		return index;
	}
	public BasicHash(int size){
		
		arr=(T[]) new Object[size]; // mostly we need to give more than 100 to avoid collision
		count = size;
	}
	
	public void add(T value) {  // it will add the value to the array to the specfic index that index is depends according to the value that is given by user
		
		if(isUserDefined(value)) { // seprating the userdefined and predefined datatype
			
											// below line generating the index 
			
			int index = generateIndex(value) ; // value is generated after according to array size we are limiting the hash value by using % operator   
			arr[index] = value;
			
			
		}else { // all o
			
			Integer index =( (Integer) value) %arr.length; // generating the index
			arr[index] = value;
			
			
		}
		count++;
		
		
	}
	
	public boolean isPresent(T value ) {
		Integer index ;
		
		if(isUserDefined(value)) { // seprating the userdefined and predefined datatype
			
			
			 index =  generateIndex(value) ;  // value is generated after according to array size we are limiting the hash value by using % operator   
			arr[index] = value;
		
		
		}else { // all o
		
			 index =( (Integer) value) %arr.length; // generating the index
			arr[index] = value;


		}
		if(arr[index].equals(value)) return true;
		
		return false;
		
	}
}

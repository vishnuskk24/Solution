package basicmaths;

public class Prblm5 {
	static int getValue(int i , int n){

		int result=1;
		for(int j=0;j<n;j++){
			
			result=result*i;

		}
//		System.out.println(result);
		return result;
	}

	
	public static boolean checkArmStrong(int n1) {
		int n=n1;
		int value=0;
		int count =0;
		int temp =n1;
		while(n1!=0) {
			n1=n1/10;
			count++;
			
		}
		while(n!=0) {
			int i=n%10;
			System.out.println(  i+"^"+count+" = "+ getValue(i, count));
			value = value + getValue( i,count);
			
			n=n/10;
		}
		System.out.println(value);
		return value==temp;
	}
	public static void main(String[] args) {
		System.out.println(checkArmStrong(371));
	}

}

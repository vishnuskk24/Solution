package Sample1;

import  java.util.Scanner;
public class Activity1 {
	
	
	
	public static String encode(String input , int key) {
		char[] vals = input.toCharArray();
		StringBuffer output = new StringBuffer();
		for(Character c : vals) {
			System.out.print( c + " - > " );
			if(c!=' ') {  // if its space we need to skip
				
			c=(char) (c+key);
			}
			System.out.println(c);
			output.append(c);
			
			
		}
		return output.toString();
		
	}

	
	public static String decode(String input , int key) {
		char[] vals = input.toCharArray();
		StringBuffer output = new StringBuffer();
		for(Character c : vals) {
			
		
			if(c!=' ') {  // if its space we need to skip
				
			c=(char) (c-key);
			}
			
			
			output.append(c);
			
			
		}
		return output.toString();
		
	}
	public static void main(String[] args) {
		
		
//		Scanner s = new Scanner(System.in);
//		String input  = (s.nextLine());
//		int key= s.nextInt();
				
//		127 - > 158
	
//		
//		System.out.println("encodde => " + input);
////		System.out.println(encode(input,key));
//		System.out.println(decode(input,key));
		
		char a=1;
		for(int i=0 ;i<300;i++) {
			
			System.out.println(i + " - > " + a);
			a++;
		}
		
		// ky?y?y?yyJL<
	}
}

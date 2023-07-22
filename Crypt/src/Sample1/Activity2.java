package Sample1;

import java.util.Scanner;

public class Activity2 {

	
	public static void encode(char[] input ) {
		
	
		if(input.length==0) return;
		int key =input[0];
		
		StringBuffer output = new StringBuffer();
		
		for(Character c :input) {
			if(c!=' ') {
				c=(char) (c+key);
			}
			output.append(c);
			
			
		}
		
		System.out.println(output +"  -- "+ key);
	}
	
	public static void decode(String s) {
		
		char[] input = s.toCharArray();
		
		if(input.length==0) return;
		
		int key = new Scanner(System.in).nextInt();
		
		StringBuffer output = new StringBuffer();
		
		for(Character c :input) {
			if(c!=' ') {
				c=(char) (c-key);
			}
			output.append(c);
			
			
		}
		output.append(key);
		System.out.println(output);
		
	}
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
//		encode(input.toCharArray());
		decode(input);
	}
}

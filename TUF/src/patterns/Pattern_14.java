package patterns;

import java.util.List;
import java.util.Scanner;

public class Pattern_14 {
	
	
	public static void pattern(int n) {
	
		for(int i =0 ;i<n;i++) {
			for(char  j='A';j<='A'+i;j++) {
			
				System.out.print(j );
			}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		pattern (n);
		
	}
}


//input   - > 5

//output

//			A
//			AB
//			ABC
//			ABCD
//			ABCDE

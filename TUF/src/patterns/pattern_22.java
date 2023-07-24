package patterns;

import java.util.Scanner;

public class pattern_22 {
	
	
	
	
	public static void pattern(int n) {
		
		for(int i=0;i<2*n-1;i++) {
			
			for(int j=0 ;j<2*n-1;j++) {
				
				int top = i;
				int down = j;
				int left = (2*n-2) -i;
				int right = (2*n-2)-j;
				
				System.out.print(n-Math.min(Math.min(left, right),Math.min(top, down)) + " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[]  args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		pattern(n);
	}
}

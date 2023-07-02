package package1;

import java.util.Scanner;

//  url  - > https://leetcode.com/problems/divide-two-integers/submissions/984731355/

public class Prblm1 {

	 public static  int divide(int dividend, int divisor) {
         if(dividend<=Integer.MIN_VALUE && divisor==-1){

           return Integer.MAX_VALUE;
       }
       if(dividend<=Integer.MIN_VALUE && divisor<0){
           return Integer.MIN_VALUE/divisor;
       }
       if(dividend==Integer.MAX_VALUE){
           return Integer.MAX_VALUE/divisor;
       }
       
       if(dividend<0 && divisor<0){
           return Math.abs( Math.round(dividend/divisor));
       }
       return Math.round(dividend/divisor);
   }
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int dividend =s.nextInt();
		int divisor = s.nextInt();
		System.out.println(divide(dividend,divisor));
	}
}

package basicJava.UsingMethod;
import java.util.*;

import string.com.ConcatStirng;
public class FascinatingNumber {

	
	
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		int num1 = num * 2 ; 
		int num2 = num * 3 ;
		String  finalNumber = num + ""+num1+""+num2 ;
		System.out.println(finalNumber);
		isFascinating(finalNumber);
	}
	
	public static void isFascinating(String  finalNumber) {
		int count = 0 ;
		for (int i = '1'; i <= '9'; i++) {
			 	for(int j = 0; j <= finalNumber.length();j++) {
			 		
			 			
			 	}
			
		}
		
		 		
	}
	
}

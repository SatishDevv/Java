package basicJava.UsingLoop;

import java.util.Scanner;

/*  A number is called a sunny number if the number next to the given number is a perfect square. 
	In other words, a number N will be a sunny number if N+1 is a perfect square.
*/

 // Using a for loops.

public class SunnyNumber {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int num   = sc.nextInt();	 // 80	
		double squrt_root =Math.sqrt(num+1); //  80+1	
		if (squrt_root % 1 == 0 ) {
			System.out.print("It is Sunny Number  : ");
		}
		else {
			System.out.println("Not Sunny number : ");
		}
		
	}

}

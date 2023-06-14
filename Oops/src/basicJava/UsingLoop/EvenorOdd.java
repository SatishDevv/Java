package basicJava.UsingLoop;

import java.util.Scanner;

public class EvenorOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.print("the numer is even : ");
		}
		else {
			System.out.print("the number is odd number : ");
		}
		
	}
}

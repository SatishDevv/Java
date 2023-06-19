package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SumOFArray {
	public static void main(String args[]) {
		
		SumOFArray obj = new SumOFArray();
		
		obj.Sum();
		
	}
	
	void Sum() {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the array Size : ");
		int arr[] = new int[sc.nextInt()];
		
		// Accept the array values Using foreach loop in java 
		
		for (int i = 0 ;i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i : arr ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int sum = 0; 
		for(int i =0 ; i<arr.length ; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
		
	}
	
	
	 
	

	
}
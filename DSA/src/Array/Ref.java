package Array;
 
//Copy array using shallow ;
// that is main reason if you in any copy array reflect all changes in array.   

import java.util.Scanner;

public class Ref {
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the array size : ");
		int arr[] = new int[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("This is an Original Array ");
		printArray(arr);
		
		int[] arr2  = arr ; 
		System.out.println("Copy array arr to arr2 : ");
		printArray(arr2);
		
		// changing arr2 values 
		
		arr2[2]= 0;
		arr2[1]= 0;
		 System.out.println("Original Array without changing : ");
		printArray(arr);
		System.out.println(" Copy  Array with changing : ");
		printArray(arr);
		
	}
	
	static void printArray(int arr[]) {
		for( int i= 0 ; i<arr.length; i++ ) {
			System.out.print( arr[i]+" " );
		}
		System.out.println();
		
	}
	
	

}

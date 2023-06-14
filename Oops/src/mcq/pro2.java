package mcq;

import java.util.Scanner;

public class pro2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter the 1st index");
		int index1 = sc.nextInt();
		System.out.println("Enter the 2nd index");
		int index2 = sc.nextInt();
		
		isSwap(arr , index1 , index2);
	}
	
	//accept the two index and swap the data between two index.  
	public static void isSwap(int arr[] , int index1 , int index2) {
		int temp  = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		
	}

}

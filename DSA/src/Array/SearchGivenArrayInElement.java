package Array;

import java.util.Scanner;

public class SearchGivenArrayInElement {

	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println(" Enter the Array Size : ");
		
		int arr[] = new int[sc.nextInt()];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("Enter the element to search : ");
		int search = sc.nextInt();
		int ans = -1 ; 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == search ) {
				ans = i ; 
				return; 
			}
		}
		if (ans == -1 ) {
			System.out.println("Not fount -1 ");
		} else {
			System.out.println("Found " +search +" at  Index "+ans);
		}
	}
	
	
	
}

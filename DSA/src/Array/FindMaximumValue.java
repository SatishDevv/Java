package Array;

import java.util.Scanner;

public class FindMaximumValue {
	
	public static void main(String args []) {
		FindMaximumValue obj = new FindMaximumValue();
		
		obj.max();
		
	}
	
	void max() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente the array Size  : ");
		int arr[] = new int[sc.nextInt()];
		
		for(int i = 0 ; i < arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		for (int i =0 ;  i<arr.length;i++ )  {
			System.out.print(arr[i]+ " ");
		}
		int max = 0 ; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j] ) {
					max = arr[i];
				}
			}
		}
		System.out.println(max);
		
	}
	
}

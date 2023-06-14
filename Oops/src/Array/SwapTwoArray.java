package Array;

import java.util.Scanner;

public class SwapTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array Size : ");
		int arr[] = new int[sc.nextInt()];
		
		for (int i = 0 ; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		System.out.print("Enter the index1 : ");
		int index1 = sc.nextInt();
		
		System.out.print("Enter the index2 : ");
		int index2 = sc.nextInt();
		
		toSwap(arr, index1,index2);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void  toSwap( int arr[], int index1 , int index2) {
		int temp = 	arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	
}










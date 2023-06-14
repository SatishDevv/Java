package Array;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {
	
	public static void main(String args[]) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the array Size : ");
		int arr[] = new int [sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		//sort the array using inbuilt method 
		//Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"");
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]< arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}

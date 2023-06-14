package mcq;

import java.util.Scanner;

public class pro3 {

		
	//zig-zag array 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first array size : ");
		int arr1[] = new int[sc.nextInt()];
		System.out.println("enter the 2nd array size : ");
		int arr2[] = new int[sc.nextInt()];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the "+i+" TH Element : ");
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Enter the "+i+" TH Element : ");
		}
		
		int f[]= new int[arr2.length + arr2.length];
		int count = 0; 
		
		for (int i = 0; i < f.length; i++) {
			if(arr1[i]<count) {
				
			}
		}
	}
}

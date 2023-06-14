package Array;
import java.util.Scanner;
//create an array which accept integer type data and print only odd number.
public class Array1 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size : ");
		int arr[] = new int[sc.nextInt()];
		
		for (int i = 0 ; i<arr.length; i++) {
			System.out.print("Enter the "+i+" th Size : ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			if( arr[i] % 2 != 0 ) {
				
				System.out.print(arr[i] +" ");
				
			}
		}
		
	}
}

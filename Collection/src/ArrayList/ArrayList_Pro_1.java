package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Pro_1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Enter the Element : ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the "+i +" Element :  ");
			list1.add(sc.nextInt());
		}
		
		System.out.print("[");
		for (int i = 0; i < 10; i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		System.out.print("]");
		
		
		
		
	}

}

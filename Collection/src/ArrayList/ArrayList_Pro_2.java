package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayList_Pro_2 {

	int RollNo ; 
	String name ;
	String MidName;
	int age;
	
	
	public ArrayList_Pro_2(int RollNo, String name, String MidName, int age) {
		super();
		this.RollNo = RollNo;
		this.name = name;
		this.MidName = MidName;
		this.age = age;
	}
	
	
	
	public static void main(String argsp[]) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList_Pro_2   Arr;
		
		ArrayList<ArrayList_Pro_2> list = new ArrayList<ArrayList_Pro_2>();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Enter the Roll : ");
			int RollNo = sc.nextInt();
			System.out.println("Enter the Name : ");
			String name= sc.next();
			System.out.println("Enter the Mid Name : ");
			String MidName = sc.next();
			System.out.println("Enter the age : ");
			int age = sc.nextInt();
			
			Arr = new ArrayList_Pro_2(RollNo,name,MidName,age);
			
		}
		
		
		
		
		
		
	}
	
	
	
	
}

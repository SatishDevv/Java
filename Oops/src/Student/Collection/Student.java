package Student.Collection;

import java.util.Scanner;

public class Student {
	static Scanner sc = new Scanner (System.in);
	int PRN ;
	int ID ; 
	String Name;
	 String LName;
	static int Marks[] = new int[5];

	public Student(int PRN, int ID, String Name ,String LName) {
		super();
		this.PRN = PRN;
		this.ID = ID;
		this.Name = Name;
		this.LName = LName;
		addMarks();
	}
	
	public static void addMarks() {
		for (int i = 0 ; i<Marks.length;i++) {
			System.out.print("Enter the "+i+" TH Marks :  ");
			Marks[i]=sc.nextInt();
		}
	}
	
	
	

}

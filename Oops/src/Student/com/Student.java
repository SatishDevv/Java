package Student.com;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	int id ; 
	String name ; 
	int marks[] = new int[5];
	
	
	public Student(int id, String name, int[] marks) {
		
		this.id = id;
		this.name = name;
		isSet();
	}	
	
	public void isSet() {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();			
		}
		
	}
	
	
}

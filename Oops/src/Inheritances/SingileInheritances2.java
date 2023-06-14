package Inheritances;
import java.util.Scanner;
class Student{
	
	int rollno;
	int marks;
	String name;
	void input() {
		System.out.println("Enter the value : "); //1
	}
}



class akash extends Student {
	
	//
	
	
	
	
	void display(int rollno,int marks , String name) {
			this.rollno=rollno;
			this.marks=marks;
			this.name=name;
			System.out.print("This is your Result : ");
		System.out.println(rollno+" "+marks+" "+name);
	}
}


public class SingileInheritances2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		akash S = new akash();
		S.input();  //
		System.out.print("Enter the Student RollNO :");
		int r = sc.nextInt();
		System.out.print("Enter the Student Marks : ");
		int m = sc.nextInt();
		System.out.print("Enter the student name : ");
		String n = sc.next();
		
		S.display(r,m,n);
		
		
		
	}

}

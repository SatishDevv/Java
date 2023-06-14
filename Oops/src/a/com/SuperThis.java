package a.com;
import Method.AddTwoNumber;
import java.util.Scanner;
class College {
	String collegeName;
	String collegeAdd;


	
}

class Student extends College {
	int rollno; 
	String name; 
	int prn;
	
	Student(String collegeName,String collegeAdd){
		this.collegeName=collegeName;
		this.collegeAdd=collegeAdd;
		
	}
	Student(String collegeName,String collegeAdd, int rollno , String name ,int prn){
		this(collegeName,collegeAdd);
		this.rollno=rollno;
		this.name=name;
		this.prn=prn;
		
	}
	void Display() {
		System.out.println("Datils Of Student  ");
		System.out.println(prn+" "+rollno +" "+name+" "+collegeName+" "+collegeAdd);
	}
	
}



public class SuperThis {
		
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter rollno : ");
		int rollno =sc.nextInt();
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("Enter the Prn : ");
		int prn = sc.nextInt();
		System.out.println("Enter the college name : ");
		String collegename=sc.next();
		System.out.println("Enter the CollegeADD : ");
		String CollegeName= sc.next();
		
		Student s = new Student(CollegeName, collegename, rollno, CollegeName, prn);
		
		s.Display();
		
		AddTwoNumber a = new AddTwoNumber();
		
		a.m1();
		
		
	}
}

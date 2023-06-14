package Student.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDriver {
	
	Student s ; 
	ArrayList<Student> Stud = new ArrayList<Student>(); 
	Scanner sc = new Scanner(System.in);
	Student st[] = new Student[5];
	
	// Design a to add Student in ArrayList 
	public void addStudent() {
		
		for(int i = 0 ; i<Stud.size(); i++) {
			if (st[i]==null) {
				
				System.err.println("Enter your Ditials : ");
				
				int PRN = 1100+i;
				System.out.println("Your PRN is : "+ PRN);
				int Id = i+2-1;
				System.out.println("Your ID  is : " + Id);
				System.out.print("Enter the Your Name : ");
				String Name = s.sc.next();
				System.out.print("Enter your Last Name : ");
				String LName = s.sc.next();
				
				s =  new Student(PRN, Id, Name, LName);
				
				st[i] = s;
				
				System.out.println("Your Addmision is Conform ");
				
				return;
			}
			
		}
		
		

	}
	
	
	

	
	public static void main(String[] args) {
		
			System.err.println("WelCome TO Qspider/Jspider");
			for(;;) {
			System.out.println("1.Add Student 2.Remove Student 3.Display Student 4.Srearch Student 5.Exit ");
			StudentDriver s1 = new StudentDriver();
			int value = s1.sc.nextInt();
			switch (value) {
			case 1 :
					s1.addStudent();
				break;
			case 2 :
					s1.addStudent();
				break;
			case 3 : 
				
				break;
			case 4 :
				
				break;
			

			default:
				System.err.println(" Thank for Visiting ");
				System.exit(0);
			}
			
		}
		
		
	}
	
	
}

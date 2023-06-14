package encapsulation;
import java.util.Scanner;
public class StudentInfo {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the name : ");
		String name = sc.next();
		//object creation 
		Student obj = new Student();
		// set the value to private data member using the setter method. 
		obj.setName(name);
		//display the private data member to calling the method. 
		System.out.print(obj.getName());
		
	}
}

// Perform some mathematical equation Using multiple Inheritances. 
package Inheritances;
import java.util.Scanner;

// here is parent class with in one  instance variables and one Addition method
class Addition {
	// instance variable.
	int ans;
	// method to calculate sum of two number.
	void Add(int num1 , int num2  ){
		this.ans=num1+num2;
		System.out.println("Sum of two number : "+ ans);
		
	}

}
// subtraction class is extends by additions class. 
// Addition is parent class and child is subtraction class
class Subtraction extends Addition {
		
	//int ans 
	//add();	
	//2
	void Sub(int num1,int num2) {
		this.ans=num1-num2;
		System.out.println("Subtraction of two number : "+ ans);
		
	}
	

}
// inherit subtraction in a multiplication class.
class Multiplication extends Subtraction {
	
	//3
	
	
	void multi(int num1 , int num2) {
		this.ans=num1*num2;
		System.out.println("Mutiplication of two number : "+ans);
		
	}
}
//inherit multiplication class in divi class.
class Mod extends Multiplication  {
	
	//4
	
	void Mod(int num1, int num2) {
		this.ans= num1/num2;
		System.out.print("The Modulo of the number : "+ans);
		
	}
}


public class MultilevelInheritance {

	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a object to mod class.
		Mod D = new Mod();
		for (;  ; ) {
			
		
			System.out.print("1.Addition 2.Subtraction 3.Multiplication 4.Divi : ");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1: {
				System.out.print("Enter the first number : ");
				int num1 = sc.nextInt();
				System.out.print("Enter the 2nd number : ");
				int num2 = sc.nextInt();
				//calling  a Method to add two number. 
				D.Add(num1, num2);
				System.err.println("--------------------");
				break;
			}
			case 2: {
				System.out.print("Enter the first Number : ");
				int num1= sc.nextInt();
				System.out.print("Enter the 2nd Number : ");
				int num2 = sc.nextInt();
				//calling a method to subtract two number .
				D.Sub(num1, num2);
				System.err.println("--------------------");
				break;
			}
			case 3 : {
				System.out.print("Enter the 1st number : ");
				int num1 = sc.nextInt();
				System.out.print("Enter the 2nd number : ");
				int num2 = sc.nextInt();
				// Calling a method to Multiplication two number .
				D.multi(num1, num2);
				System.err.println("------------------------");
				break;
			}
			case 4 : {
				System.out.print("Enter the 1st number : ");
				int num1 = sc.nextInt();
				System.out.print("Enter the 2nd number : ");
				int num2 = sc.nextInt();
				// Calling a Method to Modulo two number
				D.Mod(num1,num2);
				System.err.print("------------------------");
				break;
			}
	
			default:
				System.err.println("Enter the Validated Inpute.");
				break;
			}
		}
		
	}

}

/*
 * 				Mod D = new Mod();
				System.out.print("Enter the 1st number : ");
				int num1 = sc.nextInt();
				System.out.print("Enter the 2nd number : ");
				int num2 = sc.nextInt();
				D.Add(num1, num2);
				D.Sub(num1, num2);
				D.multi(num1, num2);
				D.Mod(num1,num2);
				
				
 
  */

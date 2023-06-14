/*
 	The super keyword in Java is a reference variable which is used to refer immediate parent class object.

	Usage of Java super Keyword
		super can be used to refer immediate parent class instance variable.
		super can be used to invoke immediate parent class method.
		super() can be used to invoke immediate parent class constructor.

 
 
 * */
package SuperKeyword;
//this id parent class 
class Person{
	//instances variables.
	int id ; 
	String name ;
	//Constructor to Assign the value to instance variables
	Person (int id , String name){
		this.id=id;
		this.name=name;
		
	}
}
//child of Person class. 
class Employes extends Person {
	int salary ; 
	//parameter Constructor to get number of parameter.
	Employes(int id,String name, int salary){
		//super call statement which is refer to parent class constructor   
		super(id,name);
		//this statement refer current class Instances variables. 
		this.salary=salary;
	}
	
	void display() {
		System.out.print(id +" "+name+" " + salary);
	}
}


public class SuperKeywordEX {
	public static void main(String args[]) {
		// Create a Object and assign the values to the constructor.
		Employes e = new Employes(101,"mayur",80000);
		//Calling a Method Using Object.
		e.display();
	}
}



//Single Inheritance Example : 

/*When a class inherits another class, it is known as a single inheritance. 
In the example given below, Dog class inherits the Animal class, so there is the single inheritance. 
	
		-----------
		| Class A |
		-----------
			^
			|
			|
		----------
		| Class B |
		-----------

*/
// You can crate new class in new file but in Sam package. 

package Inheritances;

// this is a Parent class 
class Animal {
	
	
	void eat() { //creating a method.
		System.out.println("eating...");
		System.err.println();
	}
}

// inhering the Animal class To Dog call  
// Dog is Child call of the Animal class.
class Dog extends Animal{
	
	void bark() { // creating a method 
		System.out.println("bread ...");
	}
}


public class SingileInheritances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of Dog class To access both properties Animal or Dog class 
		Dog D = new Dog();
		D.eat();
		D.bark();
	
	}

}

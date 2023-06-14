/**
 * 
 */
package abstraction;

//there is abstract class.
abstract class Bike2 {
	// here is constructor
	Bike2 (){
		System.out.println("bike is created : ");
		
	}
	//here is abstract method 
	abstract void run();
	//Creating a normal method 
	void changeGeer() {
		System.out.println("Change Gare");
	}
	
}


class hornet extends Bike2{
	// here is constructor if i am not creating any constructor compiler can write default constructor with 1st super call statement. 
	hornet(){
		super();//super call statement. this is first statement in every constructor.  
	}
	@Override 
	void run() {
		System.out.println("bike is running : ");
	}
	
}

class Bike1{
	public static void main(String args[]) {
		//creating a object.
		Bike2 b = new hornet();
		b.run();
		b.changeGeer();
	}
}
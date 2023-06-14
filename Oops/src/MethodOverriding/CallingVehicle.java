// If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.


package MethodOverriding;
//this is parent class 
class Vehicle {
	void run() {
		System.out.println("Vehicle are runing...");
	}
}

//in all child class we are declared same method present in parent class. is known as method @overriding. 
//this is child class of vehicle 
class R1 extends Vehicle {
	// this method are present in parent class same as it is declared part.
	void run() {
		System.out.println("the Vehicle are Runing Safely 100 km par Hourse : ");
	}
}
//this is child class of vehicle
class Honda extends Vehicle {
	// this method are present in parent class same as it is declared part.
	void run() {
		System.out.println("the Vehicle are Runing Safely 80 km par Hourse : ");
	}
}


public class CallingVehicle {
	public static void main(String[] args) {
		//create a object of child class which mean R1 class
		R1 r = new R1();
		r.run();
		//create a object of child class which mean Honda class 
		Honda h = new Honda();
		h.run();
	}
}

package abstraction;



// abstract class is must be declared with abstract key word.
// the abstract class we can't able to create a object. but we can create a object of child class .
abstract class Bike {
	//if you declared any method as abstract must be class declared  abstract. 
	// here is a abstract method with out any implementation. 
	abstract void run();
}

// honda class child of bike class 
class Honda1 extends Bike {
	void run() {
		System.out.print("the honda bike is runing safely 100 kmph");
	}
}


public class AbstractionClass {

	public static void main(String[] args) {
		
		Bike b = new Honda1();
		b.run();

	}

}

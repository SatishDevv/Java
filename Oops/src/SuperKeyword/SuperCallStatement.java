package SuperKeyword;

// Parent class / Super class 
class Parent {
	//constructor 
	Parent(){
		System.out.println("Parent class contructor : ");
	}
}


//child class /sub class 
class Child extends Parent {
	Child (){
		// if we can't add super call statement, compiler can add 1st statement as a super call statement in every constructor
		super();   // it is used to refer a parent / super class constructor.
		System.out.println("child class contructor : ");
	}
	// non-static Block
	{
		System.out.println("Instance Block : ");
	}
}


public class SuperCallStatement {
	public static void main(String args[]) {
		Child c = new Child();
	}

}

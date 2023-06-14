/*
 If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
 
 In this example, we are creating static methods so that we don't need to create instance for calling methods.
 
 */


package MethodOverloading;

class Add{
	//Creating static method to add two number. 
	static int add(int a , int b ) {
		return a+b;
	}
	// Creating static method to add three number.
	static int add (int a, int b, int c ) {
		return a+b+c;
	}
}



public class ChangingNumberOfArguments {
	public static void main(String[] args) {
		//When every you Create a Static method we don't need to Create instances of class.
		//so we can say we don't create a Object
				
		System.out.println(Add.add(10, 10));
		System.out.print(Add.add(100, 1,100));
	}
	

}



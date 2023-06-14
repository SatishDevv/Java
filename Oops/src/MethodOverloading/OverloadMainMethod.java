//we  can overload the main method.

/*
	Yes, by method overloading. You can have any number of main methods in a class by method overloading.
	 But JVM calls main() method which receives string array as arguments only.
*/

package MethodOverloading;

public class OverloadMainMethod {
	public static void main(String[] args) {
		System.out.println("full");
		main();
		main("Satish");
		
	}
	public static void main(String args) {
		System.out.println("with string argsonly");
	}
	public static void main() {
		System.out.println("with main only");
	}
	public static void main(int a) {
		System.out.println("with main only");
	}
	
}

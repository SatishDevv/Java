package polymorphism;

public class MethodOverloading {
	
	public static void main(String[] args) {
		main();
	}
	private static void main() {
		main(10);
		System.out.println("hii");
		
	}
	public static void main(int a ) {
		main("satish");
		System.out.println("hello  ");
	}
	public static void main(String name) {
		System.out.println("by");
	}
	
}

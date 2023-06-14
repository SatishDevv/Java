package polymorphism;

public class ConstructorOverloading {
	public static void main(String[] args) {
		
	}
	ConstructorOverloading(){
		this(10);
		System.out.println("non args cons");
	}
	ConstructorOverloading(int a ){
		this("Satish");
		System.out.println("int type cond ");
	}
	ConstructorOverloading(String a ){
		System.out.println("Strign type ");
	}
	
}

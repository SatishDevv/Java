package polymorphism;

 class A {
	 // variable shadowing 
	 int a = 10 ;
	 
	 //method  shadowing.
	 public void Method() {
		 System.out.println("hey");
	 }
}

public class MethodShadowing extends A {
	int a = 20 ;
		public void Method() {
			System.out.println("hii");
		}
		public static void main(String[] args) {
			A a = new MethodShadowing(); 
			a.Method();
			System.out.println(a.a);
		}
}


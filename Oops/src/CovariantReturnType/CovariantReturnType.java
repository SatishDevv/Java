package CovariantReturnType;

class a {
		a call() {
			System.out.print("hii");
			return this ;
		}
}

class b extends a {
	
	b call() {
		int a= 10 ;
		return null ; 
	}
}


public class CovariantReturnType {
	public static void main(String args[]) {
		
		b b1 = new b();
		b1.call();
		
		a aa = new a();
		aa.call();
		
	}
}

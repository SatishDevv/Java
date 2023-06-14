package string.com;
// String concatenation  

// it is Used to join a  two String  


public class ConcatStirng {
	public static void main(String args[]) {
		// using concat() Method .
		
		String s = new String("satish");
		
		s.concat("ghode"); //here is String is immutable.
		System.out.println(s);  //satish 
		
		s = s.concat("ghode"); // here is Storing  String a string Force fully   
		System.out.print(s); // satishghode
		
		
	}
}

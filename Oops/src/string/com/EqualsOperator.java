package string.com;
// only String


public class EqualsOperator {
	public static void main(String[] args) {
		
		// equal() Method in String class only for content comparison.
		// EX : 1
		String s = "satish";
		String s1 = "satish";
		System.out.println(s.equals(s1));  // the result is true both content and references is same.
		
		//EX : 2

		String s3 = new String ("mayura");
		String s4 = new String ("mayura");
		
		System.out.println(s4.equals(s4)); // True
		
		
		// == equals to Operator is return true when both object reference pointing to  same object.
		// EX : 1
		String s5 = "pra";
		String s6 = "pra";
		System.out.println(s5==s6); //true 
		
		
		//EX 2 
		  
		String s7 = new String("vamshi"); // ----> here is String s7 Creating new Object.
		String s8 = new String ("vamshi");// ----> here is String s8 Creating new Object.
		System.out.println(s7 == s8 );    // ----> // here s7,s8 both are refer a different different object. that why output is false.	
 		 
		
	}
}

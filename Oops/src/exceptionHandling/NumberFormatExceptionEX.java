package exceptionHandling;

public class NumberFormatExceptionEX {
	public static void main(String[] args) {
		String  s = "satish"; //String type data 
		int i  = Integer.parseInt(s); // we can't convert String to integer type that why we get NumberFormatException at Run Time.
	}
}

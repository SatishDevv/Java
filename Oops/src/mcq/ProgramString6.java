package mcq;
// Write a java program to remove duplicate char from a String.
import java.util.Scanner;

public class ProgramString6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String text = sc.next();
		
		char arr [] = text.toCharArray();
			
		System.out.println("Old String : "+ text);
		System.out.println("new String  :  "+ toDuplicates(text));
		
		
		
	}
	public static String toDuplicates( String str) {
		
		String newString = ""; 
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			if (newString.indexOf(ch)==-1	) {
				
				newString+= ch;
			}
		}
		
		
		return newString;
	}

}

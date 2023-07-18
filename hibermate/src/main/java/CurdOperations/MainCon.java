package CurdOperations;

import java.util.Scanner;

public class MainCon {
	public static void main(String[] args) {
		
	Scanner scanner  = new Scanner(System.in);
	Operations operations = new Operations();
	boolean condition = true ;
	while (condition) {
		System.out.println("1.Insert \n2.update \n3.Delete \n4.Fatch All \n5.Fatch By ID \n6.Exit ");
		int valdation = scanner.nextInt();
		switch (valdation) {
		case 1 :
				operations.studentInsert();
			break;
		case 2 :
			operations.studentUpdate();
			break;

		default:
			break;
		}
	}
		
	}

}

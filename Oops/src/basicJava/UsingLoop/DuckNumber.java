		package basicJava.UsingLoop;
import java.util.Scanner;

public class DuckNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int flag = 0 ;
		while (num > 9  ) {				
			int rem = num%10;
			if(rem==0) {
				flag = 1 ;
			}
			num/=10;
		}
		if (flag == 1 && num != 0
				) {
			System.out.println("number is DuckNumber : ");
		}else{
			System.out.print("not DuckNumber : ");;
			
		}	
	}
}

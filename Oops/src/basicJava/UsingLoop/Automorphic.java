package basicJava.UsingLoop;
import java.util.Scanner;
public class Automorphic {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		int squ = num * num;
		int rem = 1 ;
		while (num>0) {
			rem*= 10;
			num/=10;	
		}
		squ=squ%rem;
		if(squ == temp ) {
			System.out.print("number is Automorphic :  ");
		}
		else {
			System.out.print("not Automorphic : ");
		}
		
	}
}
	
package interfaceJava;
import java.util.Scanner;

interface Bank{
	float rateOfInterest(int amount );
}

class ICIC implements Bank {
	@Override
	public float rateOfInterest(int amount) {
		 int rate = 6 ; 
		 int amt = amount*rate/100;
		return amt;
	}
}

 class SBI implements Bank{
	 @Override
	 public float rateOfInterest(int amount) {
		int rate = 7 ; 
		int amt = amount  * rate/100;
		return amt;
	 }
}
 
 class KotakBank implements Bank{
	 KotakBank(){
		 
	 }
	 @Override
	 public float rateOfInterest (int amount) {
		 int rate = 8 ; 
		 int amt = amount * rate /100;
		 return amt ;
	 }
 }

 class AXIS implements Bank {
	 @Override
	 public float rateOfInterest(int amount) {
		 int rate = 9 ; 
		 int amt = amount * rate / 100;
		 return amt;
	 }
	 
 }

public class InterfaceBank {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		for(;;) {
			System.err.println("Chose the bank to calculate interest : ");
			System.out.println("1.ICIC 2.SBI 3.Kotak Bank 4.AXIS 5.Exit");
			
			switch (sc.nextInt()) {
			case 1:{
					System.out.print("Enter the Amount  : ");
					int amt =sc.nextInt();
					ICIC ic =new ICIC();
					System.out.println(" Interest of ICIC Bank :"+ic.rateOfInterest(amt));
					break;
			}
			case 2 : {
				System.out.print(" Enter the Amount : ");
				int amt = sc.nextInt();
				SBI sbi = new SBI();
				System.out.println("Interest of SBI Bank : "+sbi.rateOfInterest(amt));
				break;
				
			}
			case 3 : {
				System.out.print("Enter the Amount: ");
				int amt = sc.nextInt();
				KotakBank kotak = new KotakBank();
				System.out.println("Interest id KotalBank : "+kotak.rateOfInterest(amt));
			}
			case 4 : {
				System.out.print("Enter the Amount: ");
				int amt = sc.nextInt();
				KotakBank kotak = new KotakBank();
				System.out.println("Interest id KotalBank : "+kotak.rateOfInterest(amt));
			}
			case 5 : {
				System.exit(0);
			}
			default:
				System.out.println("Enter the valid Input : ");
				break;
			}
		}
	}
}

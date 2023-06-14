

package MethodOverriding;
import java.util.Scanner;
class Bank {
	int ammout ;
	
	int getRateOfInterest(){
		return 0;
	}
}

class AXIS extends Bank {
	int interest = 9 ; 	
	int getRateOfInterest(int amount) {
		this.ammout=amount;
		int amt =(amount * interest)/100;
		return amt;
	}
}

class SBI extends Bank {
	int interest = 8 ;
	int getRateOfInterest(int amount) {
		this.ammout=amount;
		int amt = (amount * interest)/100; 
		return amt;
	}
}

class ICICI extends Bank {
	int interest = 7 ;
	int getRateOfInterest(int amount ) {
		this.ammout = amount;
		int amt = (amount*interest)/100;
		
		return amt;
	}
}


public class CallingBank {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		for (; ;) {
			System.err.println("Chose a Bank To Calculate Interest");
			System.out.print("1.AXIS 2.SBI 3.ICICI : ");
			int chose = sc.nextInt();
			switch (chose) {
				case 1: {
					System.out.print("Enter The Amount to Calculate Interest : ");
					int amount = sc.nextInt();
					AXIS a = new AXIS();
					System.out.println("The Total ONE Year Interest in AXIS Bank, Calculate "+a.interest+" % : "+a.getRateOfInterest(amount));
					System.err.println("----------------------------------------------------------------");
					break;
				}
				case 2 : {
					System.out.print("Enter the Amount to Calculate a Interest : ");
					int amount = sc.nextInt();
					SBI s = new SBI();
					System.out.println("The Total ONE Year Interest in SBI Bank, Calculate "+s.interest+" % : "+s.getRateOfInterest(amount));
					System.err.println("----------------------------------------------------------------");
					break;
				}
				case 3 : {
					System.out.print("Enter the Amount to Calculate a Interest : ");
					int amount = sc.nextInt();
					ICICI i = new ICICI();
					System.out.println("The Total ONE Year Interest in ICICI Bank, Calculate "+i.interest+" % : "+i.getRateOfInterest(amount));
					System.err.println("----------------------------------------------------------------");
					break;
				}
				default:{
					System.err.println("Plz Enter the Valid Input : ");
					break;
				}
			}
			
				
		}
	}
}

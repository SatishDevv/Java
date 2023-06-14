package OlaApplication;
import java.util.Scanner;;


public class ReadBusDriver {
	Scanner sc= new Scanner(System.in);
	Account a ;
	public void  login() {
		if(a==null) {
			System.out.println("Enter Yout name : ");;
			String name = sc.next();
			System.out.println("Enter Yout name : ");
			String Address = sc.next();
			System.out.println("Enter Yout name : ");
			String vacc = sc.next();
			System.out.println("Enter Yout name : ");
			long Mobail = sc.nextLong();
			a=new Account(name,Address, vacc , Mobail);
			System.out.println("Login done : ");
			
		}
		else {
			System.out.print("add Account first : ");
		}
	}
	public void LogOut() {
		if(a==null ) {
			System.out.println("Create Accounr First : ");
		}else {
			a=null;
			System.out.println("Accpunt is logout : ");
		}
	}
	
	
	

}

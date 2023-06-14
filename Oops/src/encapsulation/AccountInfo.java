package encapsulation;
import java.util.List;
import java.util.Scanner;
public class AccountInfo  {
	public static void main(String args[]) {

		
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the Acc_no : ");
		int Acc_no = sc.nextInt();
		System.out.print("Enter the name : ");
		String name = sc.next();
		System.out.print("Enter the mail : ");
		String email= sc.next();
		System.out.print("Enter the amount : ");
		float amount=sc.nextFloat();
		System.out.print("Enter your Address : ");
		String add=sc.next();
		Account obj = new Account();
		obj.setInfo(Acc_no, name, email, amount, add);
		System.out.print(obj.getInfo());
		/*
		Object obj1 = new Object();
		obj1.hashCode();
		int age = 10 ;
		String str = "hii i am satish from Sangamner "+"my age is "+age+"old";
		System.out.println(str);
		*/
	}

}

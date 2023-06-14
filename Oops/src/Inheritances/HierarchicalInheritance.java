package Inheritances;
import java.util.Scanner;
class Cap{
	
	String from;
	String to;
	int km;
	double price ;

}


class Mini extends Cap {
		
	 Mini (String from , String to ,int km) {
		this.from=from;
		this.to = to;
		this.km=km;
		this.price=km*5;
		System.err.println("congarts You Mini Cap is Comming ");
		System.out.println("Your Starting Point : "+from+" : end point : "+to+": Total km : "+km+": Total Price :" +price);
	}
}

class  Marco extends Cap{
	
	 Marco (String from, String to,int km) {
		this.from=from;
		this.to=to;
		this.km=km;
		this.price=km*10;
		System.err.println("congarts You Mini Marco is Comming ");
		System.out.println("Your Starting Point : "+from+" : end point : "+to+": Total km : "+km+": Total Price :" +price);
		
	}
}


class Prime extends Cap{
	
	Prime(String from, String to , int km) {
		this.from=from ;
		this .to=to;
		this.km=km;
		this.price=km*15;
		System.err.println("congarts You Prime Cap is Comming ");
		System.out.println("Your Starting Point : "+from+" : end point : "+to+": Total km : "+km+": Total Price :" +price);
		
	}
}


	
public class HierarchicalInheritance {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cap ca;
		for ( ; ; ) 
		System.out.print("1.Ride 2.Cancel Ride ");
		
		
	}

}



package phone.com;
import java.util.Iterator;
import java.util.Scanner;
public class Phone {
	static Scanner sc= new Scanner(System.in);
	Bluetooth b ;
	void connectBluetooth(){
		
		if (b==null) {
			System.out.println("Enter the Blouetooth name  : ");
			String name = sc.next();
			b= new Bluetooth(name);
			System.out.println("Blutooth id Connected");
		} else {
			System.out.println("all connect Blutooth");
			
		}
	
	}
	void removeBluetooth() {
		if (b==null) {
			System.out.println("first add Blutooth : ");
		} else {
			b=null;
			System.out.println("Bluetooth is DisConnectec");
		}
		
	}
	void displayBluetoothDatils() {
		if (b==null) {
			System.out.println("add Blouetooth ");
		} else {
			System.out.println(b.name);
		}
		
	}
	
public static void main(String args[]) {
	Phone ph = new Phone();
	for(;;) {
		System.out.println("1.AddBluetooth 2.removeBlutooth 3.DispalyBluetooth 4 .exit");
		switch (sc.nextInt()) {
		case 1:
				ph.connectBluetooth();
			break;
		case 2 : 
			ph.removeBluetooth();
			break;
		case 3 : 
			ph.displayBluetoothDatils();
			break;
		default:
			return;
		}
	}
	
}
	

}

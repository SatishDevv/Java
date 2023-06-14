package Hotel.com;
import java.util.Scanner;
public class HoleApplication {
	Scanner sc = new Scanner (System.in);
	Hotel h ;
	public void ChooseFood() {
		System.out.print("1.vag 2.Non-Veg");
		switch(sc.nextInt()) {
			case 1 :{
				h = new Vag();
				break;
			}
			case 2 :{
				h= new NoVag();
				break;
			
			}
		}
	}
		public void orderFood() {
			if (h instanceof Vag) {
				Vag v1 = (Vag)h;
				for (;;) {
					System.out.println("1."+"Chapati"+v1.price);
				}
			}
		}
		
	public void addHotal(){
			
					
			
		
	}
	public void bill() {
		
	}
	
	public static void main (String arg[]) {
		HoleApplication ha = new HoleApplication();
		for(;;) {
			System.out.print("1.chose Hotal 2.order food 3.bill 4.Exit");
			switch (ha.sc.nextInt()) {
				case 1:{
					ha.ChooseFood();
					break;
				}
				case 2:{
					ha.orderFood();
				}
				case 3:{
					ha.bill();
					
				}

			default:
				return;
			}
		}
	}
	

}

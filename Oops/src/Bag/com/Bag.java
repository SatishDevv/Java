package Bag.com;
import java.util.Scanner;
public class Bag {
	Book b; 
	Laptop l ;
	static Scanner sc= new Scanner(System.in);
	public void add() {
		if (b==null&&l==null) {
			System.out.println("1.Book 2.Laptop");
			switch (sc.nextInt()) {
			case 1:{
				System.out.print("enter the Book name");
				String name = sc.next();
				b = new Book(name);
				System.out.println("book is added");
				break;
			}
			case 2 :{
				System.out.println("enter the Laptop name");
				String Lname = sc.next();
				System.out.println("enter the color ");
				String color = sc.next();
				l = new Laptop(Lname,color);
				System.out.println("Laptop is added");
				break;
			}
			default:{
				System.out.println("Enter the valid input ");
				break;
			}
			}
		} else {
			System.out.println("add laptop yaa Book");

		}
	}
	public void remove() {
		if (b==null && l==null) {
			System.out.println("add Laptop yaaa Book First : ");
		} else {
			if(b instanceof Book) {
				b=null;
				System.out.println("book is removed : ");
			}
			if(l instanceof Laptop) {
				l=null;
				System.out.println("laptop is removed: ");
			}
		}
	}
	public void displayInfo() {
		if (b==null && l==null) {
			System.out.println("Add laptop yaa Book");
		} else {
			if(b instanceof Book){
				System.out.println(b.bookName);	
			}
			if(l instanceof Laptop) {
				System.out.println(l.LName);
				System.out.println(l.color);
			}
		}
	}
public static void main(String[] args) {
	Bag b= new Bag();
	for(;;) {
		System.out.println("1.add 2.remove 3.display 4.exit");
		switch (sc.nextInt()) {
		case 1:
			 b.add();
			break;
		case 2 : 
			b.remove();
			break;
		case 3 :
			b.displayInfo();
			break;
		default:
			return;
		}
	}
	
}
	
}

package LinkedList;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.LinkedList;

public class StordBookObject {
	
	
//	non-static data and instance variables 
	int id ;
	String name , publication ;
	int qut;
	// constructor 
	public StordBookObject(int id, String name, String publication, int qut) {
		super();
		this.id = id;
		this.name = name;
		this.publication = publication;
		this.qut = qut;
	}
	
	
	public static void main(String args[]) {
		
		
		// Create list of StordBookObject class
		LinkedList<StordBookObject> list = new LinkedList<StordBookObject>();
		// adding the object in list  
		list.add(new StordBookObject(101, "java" , "me ",10));
		list.add(new StordBookObject(102, "Python" , "satish",20));

		// Travel the element on forward  
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			StordBookObject sbo = (StordBookObject) ite.next();
			System.out.println("Book ID : "+sbo.id +" Book Name :  " + sbo.name + "publication :  "+sbo.publication);
		}
	}

}

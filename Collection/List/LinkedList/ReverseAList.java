package LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseAList {
	
	public static void main(String args[]) {
		
		List list = new LinkedList<String>();
		
		list.add("Satish");
		list.add("mayur");
		list.add("Divakar");
		
		System.out.println(list );
        Iterator ite; 
        ite = list.iterator();
		System.out.println("Normal LinkedList");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("Reverse a LinkedList");
		Collections.reverse(list);
		System.out.println(list);
		
	}

}

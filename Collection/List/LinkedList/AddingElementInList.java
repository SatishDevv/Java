package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddingElementInList {
	
	public static void main(String args[]) {
		// It creating a empty LinkedList of String .
		List<String> list = new LinkedList<String>();
		// It process of adding the element in LinkedList 
		list.add("satish");
		list.add("mayar");
		list.add("divakar");
		
		// It is iterator interface is used to iterating the element forward.
		Iterator <String> itr = list.iterator();
		
		while (itr.hasNext()) {// hasNext() method is used to check the next element present or not in linkedList.
			String string = (String) itr.next(); // next() method is used move to the next element.
			
			System.out.println(string);
		}
		
	
		
		
	}
}

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArayListEX1 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		//Printing ArrayList Using for-each loop.
		for(Integer num : list) {
			System.out.println(num);
		}
		
		//Sorting the ArrayList 
		System.err.println("---------------------Sorting ArrayList-------------------------------------");
		
		ArrayList<String > list2 = new ArrayList<String>();
		list2.add("satish");
		list2.add("divakar");
		list2.add("mayar");
		list2.add("Akash");
		//Sort the ArrayList Using .sort Method 
		Collections.sort(list2);
		//Printing the ArrayList using Iterator interface.
		Iterator<String> ite = list2.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}

}

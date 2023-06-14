package Collection_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Employess {
	private int empno;
	private String ename;
	private double salary ;
	
	
	public Employess(int empno, String ename , double salary) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	public String getEname() {
		return ename;
		
	}
	
	public double getSalary() {
		return salary;
	}

	public String toString() {
		return empno+" "+ename+" "+salary;
	}
	

}


public class CURD{
	
	Employess emp ;
	List<Employess> coll = new ArrayList<Employess>();
	Scanner scInt = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	

	
	public void insertRec() {
		System.out.print("Enter empno : ");
		int enpno = scInt.nextInt();
		System.out.print("Enter EmpName :  ");
		String name = scStr.nextLine();
		System.out.print("Enter Salary : ");
		double salary = scInt.nextDouble();
		
		coll.add(new Employess(enpno, name, salary));
		
		System.err.println("Record Insert : ");
		
	}
	
	public void displayRec() {
		boolean found = false ;
		System.out.println("-------------------------------------------");
		Iterator<Employess> i = coll.iterator();
		while(i.hasNext()) {
			Employess e = i.next();
			System.out.println(e);
			found = true ;
		}		
		if(!found) {
			System.out.println("Record Not Found ");
		}
		System.out.println("-------------------------------------------");
	}
	
	public void searchRec() {
		 boolean found = false ;
		System.out.print("Enter empno to search : ");
		int empno = scInt.nextInt( );
		System.out.println("-------------------------------------------");
		Iterator<Employess> i = coll.iterator();
		while(i.hasNext()) {
			Employess e = i.next();
			if(e.getEmpno() == empno) {
				System.out.println(e);
				found = true ; 	
			}
		}		
		if(!found) {
			System.err.println("Record Not Found  " );
		}
		System.out.println("-------------------------------------------");
	}
	
	public void delateRec() {
		boolean found = false;
		System.out.print("Enter EmpNo to Delete : ");
		int empno = scInt.nextInt();
		System.out.println("-------------------------------------------");
		Iterator<Employess> i = coll.iterator();
		while(i.hasNext()) {
			Employess e = i.next();
			if(e.getEmpno() == empno) {
				i.remove();
				found = true;
			}
		}
		if(!found) {
			System.err.println("Record Not Found  " );
		}else {
			System.out.println("Record is Delete Successfully...!");
		}
		System.out.println("-------------------------------------------");
	}
	
	public void updateRec() {
		boolean found = false ;
		System.out.print("Enter EmpNO to Update : ");
		int empno = scInt.nextInt();
		System.out.println("-------------------------------------------");
		ListIterator<Employess> li = coll.listIterator();
		while(li.hasNext()) {
			Employess e = li.next();
			if(e.getEmpno() == empno) {
				
				System.out.print("Enter new Name : ");
				String name = scStr.nextLine();
				System.out.print("Enter new Salary : ");
				double salary = scInt.nextDouble();
				
				li.set(new Employess(empno, name, salary));
				found = true ;
			}
			
		}
		if(!found) {
			System.err.println("Record Not Found");
		}else {
			System.err.println("Record is Updated");
		}
		System.out.println("-------------------------------------------");

		
	}
	
	
	
	public static void main(String[] args) {
		
		CURD curd = new CURD();
		 
		Scanner sc = new Scanner (System.in);
		int ch ;
		do {
			System.out.println("0.Exit 1.Insert 2.Display 3.Search 4.Delete 5.Update");
			System.out.print("Enter your choice : ");
			
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					curd.insertRec();
					break;
				case 2:
					curd.displayRec();
					break;
				case 3:
					curd.searchRec();
					break;
				case 4 : 
					curd.delateRec();
					break;
				case 5	: 
					curd.updateRec();
					break;

			}
			
		} while (ch!=0);
	}
	
}


















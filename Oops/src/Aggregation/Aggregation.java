/*
 * 
 * If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
 * 
 * 
 Consider a situation, Employee object contains many informations such as id, name, emailId etc. 
 It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc.
  as given below.

 */
package Aggregation;
	// here is class to contains own information city state country etc.
class Address{
	String city,state,country;
	
	//Contractor . 
	public Address(String city, String state, String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
// no relation between any class 

//Creating a class to contains instances variables and method 
class Emp{
	int id ; 
	String name; 
	Address address; // Aggregations Address is class .	  
	
	public Emp(int id, String name , Address address) {
		this.id=id;
		this.name=name;
		this.address=address; 
	}
	
	void Display() {
		System.out.println(id+" "+name+" "+address.city+" "+address.state+" "+address.country);
	}
}


public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address("Pune","Maharas","India");
		Address add1 = new Address ("Pune","maharas","India");
		
		Emp e1 = new Emp(101,"Satish",add);
		Emp e2 = new Emp(102,"Mayur",add1);
		
		e1.Display();
		e2.Display();
	}
	
}


/*
 
 # When use Aggregation?
I]. Code reuse is also best achieved by aggregation when there is no is-a relationship.
II]. Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved;
 otherwise, aggregation is the best choice.


*/

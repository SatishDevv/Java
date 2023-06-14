package encapsulation;
//public class 
public class Student {
	//private data member private means : access  with in same class only.
	private String  name ; 
	
	//This is setter method to set the value to the variable.
	//Write a value
	void setName(String name) {
		this.name = name;
	}
	//Getter method is used to return the value.
	//Read the Value.
	 String getName() {
		 return name;
	}
	
}
	
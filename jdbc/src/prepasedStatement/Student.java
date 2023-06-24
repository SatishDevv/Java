package prepasedStatement;

public class Student {
	
	private int ID ;
	private String name ; 
	private Double marks ;
	private Long phone ;
	private  String address;
	
	public Student(String name, Double marks, Long phone, String address) {
		super();
		this.name = name;
		this.marks = marks;
		this.phone = phone;
		this.address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}

package onetoone_nui.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int Pid ;
	private String name ;
	private long phone ;
	private  String address ;
	//one to one relationship and has a relationship. 
	@OneToOne
	private AdarCard adarCard;

	
	

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public AdarCard getAdarCard() {
		return adarCard;
	}

	public void setAdarCard(AdarCard adarCard) {
		this.adarCard = adarCard;
	}

	
	
	
	
	
	
		
}

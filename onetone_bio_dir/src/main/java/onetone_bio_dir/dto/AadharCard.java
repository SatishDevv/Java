package onetone_bio_dir.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AadharCard {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int Aadhar_id ;
	private String name ;
	private String last_name;
	private long Phone ; 
	private String adress ; 
	
	@OneToOne
	 private Person person ;

	public int getAadhar_id() {
		return Aadhar_id;
	}

	public void setAadhar_id(int aadhar_id) {
		Aadhar_id = aadhar_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	} 
	

}

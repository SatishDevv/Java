package onetoone_bio.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Person_id ;
	private String name ;
	
	private long phone ;
	private String adderss ;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn
	private AadharCard aadharCard;
	public int getPerson_id() {
		return Person_id;
	}
	public void setPerson_id(int person_id) {
		Person_id = person_id;
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
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	public AadharCard getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}
	
	@Override
	public String toString() {
		return "Person [Person_id=" + Person_id + ", name=" + name + ", phone=" + phone + ", adderss=" + adderss
				+ ", aadharCard=" + aadharCard + "]";
	}
	
	
	
	
	
	
	

}

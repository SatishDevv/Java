package otm_mto_bio.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int College_id ; 
	private String name ; 
	private String loctions ; 
	private long fees ; 
	
	@OneToMany(mappedBy = "college")
	private List<Student> students ;

	public int getCollege_id() {
		return College_id;
	}

	public void setCollege_id(int college_id) {
		College_id = college_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoctions() {
		return loctions;
	}

	public void setLoctions(String loctions) {
		this.loctions = loctions;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	

}

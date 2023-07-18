package CurdOperations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class Student {
	

	
	@Id
	private int student_Id;
	private String student_Name;
	private String student_LName;
	private String student_Email;
	private String student_Passwrd;
	private int student_Mark;
	
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_LName() {
		return student_LName;
	}
	public void setStudent_LName(String student_LName) {
		this.student_LName = student_LName;
	}
	public String getStudent_Email() {
		return student_Email;
	}
	public void setStudent_Email(String student_Email) {
		this.student_Email = student_Email;
	}
	public String getStudent_Passwrd() {
		return student_Passwrd;
	}
	public void setStudent_Passwrd(String student_Passwrd) {
		this.student_Passwrd = student_Passwrd;
	}
	public int getStudent_Mark() {
		return student_Mark;
	}
	public void setStudent_Mark(int student_Mark) {
		this.student_Mark = student_Mark;
	}
	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", student_LName="
				+ student_LName + ", student_Email=" + student_Email + ", student_Passwrd=" + student_Passwrd
				+ ", student_Mark=" + student_Mark + "]";
	}
	
		
	
	
	
	
	

}

package com.employee.main;


public class Employee {


	private int EMPID;
	private String FName;
	private String lName;
	private Long phoneNo;
	private double salary;
	private String address;
	private String position;
	private int managerID;
	
	



	public Employee(int EMPID, String FName, String lName, Long phoneNo, double salary, String address, String position,int managerID) {
		super();
		this.EMPID = EMPID;
		this.FName = FName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.salary = salary;
		this.address = address;
		this.position = position;
		this.managerID = managerID;
	}

	public int getEMPID() {
		return EMPID;
	}

	public void setEMPID(int EMPID) {
		this.EMPID = EMPID;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

}

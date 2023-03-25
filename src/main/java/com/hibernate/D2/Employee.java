package com.hibernate.D2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity // convert/ map POJO class to database 
@Table (name = "orm_employee") //Modify name
public class Employee {
	
	@Id  // to make it primary key 
	@GeneratedValue (strategy = GenerationType.IDENTITY) //AUTO --> It creates a too many table IDENTITY --> best option 
	@Column (name = "empId")
	private int id;
	@Column (name = "empfname", nullable = false)
	private String fName; 
	@Column (name = "emplname", nullable = false)
	private String lName;
	private Double salary;
	
	private String department; 
	
	@Transient  //Hide from the db table 
	private int netTax;
	
    private companyProfile companyProfile;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNetTax() {
		return netTax;
	}

	public void setNetTax(int netTax) {
		this.netTax = netTax;
	}

	public companyProfile getCompanyProfile() {
		return companyProfile;
	}

	public void setCompanyProfile(companyProfile companyProfile) {
		this.companyProfile = companyProfile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", salary=" + salary + ", department="
				+ department + ", netTax=" + netTax + ", companyProfile=" + companyProfile + "]";
	}

	
  

}

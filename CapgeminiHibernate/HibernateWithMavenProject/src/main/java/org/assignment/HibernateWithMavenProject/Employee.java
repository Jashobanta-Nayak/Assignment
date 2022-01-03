package org.assignment.HibernateWithMavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {
	// id, name, city
	@Id
	private int empId;
	private String empName;
	private long EmpPh;
	private String empDekNo;
	
	
	// parameterized constructor
	public Employee(int empId, String empName, long empPh, String empDekNo) {
		this.empId = empId;
		this.empName = empName;
		this.EmpPh = empPh;
		this.empDekNo = empDekNo;
	}
	// zero-parameterized constructor


	public Employee() {
		super();
	}

	// Setter & Getter methods
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public long getEmpPh() {
		return EmpPh;
	}


	public void setEmpPh(long empPh) {
		EmpPh = empPh;
	}


	public String getEmpDekNo() {
		return empDekNo;
	}


	public void setEmpDekNo(String empDekNo) {
		this.empDekNo = empDekNo;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", EmpPh=" + EmpPh + ", empDekNo=" + empDekNo
				+ "]";
	}
	
	
}

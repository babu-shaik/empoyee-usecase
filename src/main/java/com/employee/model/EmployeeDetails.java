package com.employee.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeDetails {

	@Id
	@Column
	private int empId;
	@Column
	private String empName;
	@Column
	private String empDept;
	@Column
	private float empSal;
	@Column
	private LocalDate empJoiningDate;
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetails(int empId, String empName, String empDept, float empSal, LocalDate empJoiningDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSal = empSal;
		this.empJoiningDate = empJoiningDate;
	}
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
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	public LocalDate getEmpJoiningDate() {
		return empJoiningDate;
	}
	public void setEmpJoiningDate(LocalDate empJoiningDate) {
		this.empJoiningDate = empJoiningDate;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSal="
				+ empSal + ", empJoiningDate=" + empJoiningDate + "]";
	}
	
	
	
}

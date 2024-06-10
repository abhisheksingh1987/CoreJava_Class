package com.abhi.collection;

public class Employee {
	
	private int empId;
	private String empName;
	private String mobileNo;
	private int empAge;
	public Employee() {
		super();	
	}
	public Employee(int empId, String empName, String mobileNo, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mobileNo = mobileNo;
		this.empAge = empAge;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mobileNo=" + mobileNo + ", empAge=" + empAge
				+ "]";
	}
}

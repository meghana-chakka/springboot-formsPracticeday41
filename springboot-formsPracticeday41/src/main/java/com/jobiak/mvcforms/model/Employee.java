package com.jobiak.mvcforms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employdata")
public class Employee {
    @Id
	private Long empId;
	private String empname;
	private Long mobile;
	private double empsal;
	private String empdesg;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Long getEmpId() {
		return empId;
	}


	public void setEmpId(Long empId) {
		this.empId = empId;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public Long getMobile() {
		return mobile;
	}


	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


	public double getEmpsal() {
		return empsal;
	}


	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}


	public String getEmpdesg() {
		return empdesg;
	}


	public void setEmpdesg(String empdesg) {
		this.empdesg = empdesg;
	}
	
}

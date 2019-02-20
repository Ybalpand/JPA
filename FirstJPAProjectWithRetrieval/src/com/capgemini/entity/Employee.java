package com.capgemini.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
public class Employee {
	
	@Id
	private int eno;
	private String ename;
	private float esalary;
	private String eaddress;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	
	
	
	

}

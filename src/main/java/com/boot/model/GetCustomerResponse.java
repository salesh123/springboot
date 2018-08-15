package com.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class GetCustomerResponse {
	/*   private int id;
	   private String Name;
	   private String address;*/
	 private String salary;
	 private int id;
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GetCustomerResponse(String salary, int id) {
		super();
		this.salary = salary;
		this.id = id;
	}
	public GetCustomerResponse() {
			}
}

package com.servelet.hibernateproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
@Id
	int id;
	String name;
	Double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}

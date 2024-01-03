package com.serve_demo;

import java.time.LocalDate;

public class Registration_details {
private String firstname;
private String lastname;
private String email;
private String password;
private String address;
public Registration_details() {
	super();
}
public Registration_details(String firstname, String lastname, String email, String password,
		String address) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.address = address;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password2) {
	this.password = password2;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}



}

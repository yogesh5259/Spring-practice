package com.spring.practice;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Customer {

	private String firstName;
	
	@NotNull()
	@Size(min = 1, message = "is Reqired!")
	private String lastName;
	
	@NotNull(message = "is required!")
	@Min(value = 1, message = "Must be greater then 1")
	@Max(value = 10, message ="Must be less then 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-z0-9]{5}", message = "Must be 5 char/digit")
	private String postalCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
}

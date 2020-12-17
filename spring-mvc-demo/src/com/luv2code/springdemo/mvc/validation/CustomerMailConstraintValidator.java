package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerMailConstraintValidator implements ConstraintValidator<CustomerMail, String> {

	private String customerMailValueOne;
	private String customerMailValueTwo;

	
	@Override
	public void initialize(CustomerMail thecustomerMail) {
		customerMailValueOne = thecustomerMail.valueOne();
		customerMailValueTwo = thecustomerMail.valueTwo();

	}
	
	@Override
	public boolean isValid(String theMail, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;
		
		if(theMail != null) {
			result = theMail.endsWith(customerMailValueOne) | theMail.endsWith(customerMailValueTwo);
			return result;
		} else {
			return true;
		}
		
	}

}

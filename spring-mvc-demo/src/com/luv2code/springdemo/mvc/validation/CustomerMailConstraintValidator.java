package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerMailConstraintValidator implements ConstraintValidator<CustomerMail, String> {

	
	private String[] customerMailValue;

	
	@Override
	public void initialize(CustomerMail thecustomerMail) {
		customerMailValue = thecustomerMail.value();
	}
	
	@Override
	public boolean isValid(String theMail, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result = false;
		
		if(theMail != null) {
			for(String s : customerMailValue) {
				if (theMail.toLowerCase().endsWith(s)) {
					result = true;
					break;
				}
			}
			return result;
		} else {
			return true;
		}
		
	}

}

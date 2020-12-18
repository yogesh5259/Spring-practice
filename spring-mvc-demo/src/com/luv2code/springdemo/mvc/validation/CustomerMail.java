package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CustomerMailConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerMail {

	public String[] value() default {".com",".org",".edu"};
	
	public String message() default "Email id must end with .com or .org";
	
	// define default groups
	public Class<?>[] groups() default {};
		
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
}

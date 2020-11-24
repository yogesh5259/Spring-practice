package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	//Controller method to show form
	@RequestMapping("/ShowForm")
	public String showForm() {
		return "studentForm";
	}
	
	
	//Controller method for confirmation message
	@RequestMapping("/processForm")
	public String comfirmation() {
		return "comfirmation";
	}
	
	
}

package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentController {

	@RequestMapping("/ShowForm")
	public String showForm(Model model) {
		
		Student theStudent = new Student();
		
		model.addAttribute("student",theStudent);
		
		return "studentForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.print(theStudent.getFirstName() + " " + theStudent.getLastName());
		return "confirmation";
	}
	
}

package com.spring.practice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
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
	
	@RequestMapping("/processFormVersionTwo")
	public String processForm(HttpServletRequest request,Model model) {
		
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String name = theName + " Yo!";
		model.addAttribute("message", name);
		
		return "comfirmation";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model) {
		
		theName = theName.toUpperCase();
		String name = theName + " Yo! Form version Three";
		model.addAttribute("message", name);
		
		return "comfirmation";
	}
	
	
	
	
	
}

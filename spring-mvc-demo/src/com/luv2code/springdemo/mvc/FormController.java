package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hey")
public class FormController {

	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message 
		String result = "Hey My Friend From another Controller! " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}

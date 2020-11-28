package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentController {

	@RequestMapping("/ShowForm")
	public String showForm() {
		return "studentForm";
	}
	
}

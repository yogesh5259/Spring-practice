package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// Controller method 
	@RequestMapping("/")
	public String homePage() {
		return "homepage";
	}

}

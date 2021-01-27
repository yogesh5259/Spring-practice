package com.springmvc.formcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HomeController {
	
	@RequestMapping("/list")
	public String home() {
		
		return "user-list";
	}
}

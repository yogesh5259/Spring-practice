package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	public StudentController() {
		System.out.println("Student controller object get created!!");
	}
	
	
	@ResponseBody
	@RequestMapping("/homework")
	public String getHomeWork() {
		return "Math work!!!";
	}
	
	@ResponseBody
	@RequestMapping("/work")
	public String getWork() {
		return "Work!!!";
	}
	
	

}

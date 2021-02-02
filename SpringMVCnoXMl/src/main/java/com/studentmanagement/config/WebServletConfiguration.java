package com.studentmanagement.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration { //implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		System.out.println("On startup method called...");
		
//		//create web context using xml if spring config is xml
//		XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
//		xmlWebApplicationContext.setConfigLocation("classpath:spring-mvc-servlet.xml");
//		
		
		//java based config 
		AnnotationConfigWebApplicationContext annotationConfigApplicationContext = new AnnotationConfigWebApplicationContext();
		annotationConfigApplicationContext.register(StudentManagementSpringConfig.class);
		
		//create dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigApplicationContext);
		
		//add servlet to servlet context
		ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("dispatcher", dispatcherServlet);
		
		//set properties
		servletRegistration.setLoadOnStartup(1);
		servletRegistration.addMapping("/");
		
		
		System.out.println("on startup method end....");
		
		
	}

}

package com.studentmanagement.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringShortHandConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] array = {StudentManagementSpringConfig.class};
		return array;
	}

	@Override
	protected String[] getServletMappings() {

		String[] array = {"/"};
		
		return array;
	}

}

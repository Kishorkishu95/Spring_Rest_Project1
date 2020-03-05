package com.kishor.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringDispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] { DempAppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] { "/" };
	}

}

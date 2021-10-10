package com.attendance.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AttendanceApplicationContext {
	private static ApplicationContext ctxt;
	
	public static ApplicationContext getInstance() {
		if (ctxt == null) {
			ctxt = new ClassPathXmlApplicationContext("application-context.xml");
		}
		
		return ctxt;
	}
}

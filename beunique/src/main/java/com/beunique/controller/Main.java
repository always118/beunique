package com.beunique.controller;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("src/main/webapp/WEB-INF/applicationContext.xml");
		System.out.println(f.getAbsolutePath());
		ApplicationContext context = new ClassPathXmlApplicationContext("webapp/WEB-INF/applicationContext.xml");
		TestController controller = (TestController) context.getBean("testController");

		System.out.println(controller.getGit());
	}

}

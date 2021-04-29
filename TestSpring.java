package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.Database;


public class TestSpring {

	
	public static void main(String[] args) {
	
	
	
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		
		Database MySQL =  (Database) context.getBean("mysqlDatabase");
		
		System.out.println(MySQL);
		
		System.out.println("------------------------");
		
		
		Database Oracle = (Database) context.getBean("oracleDatabase");
		
		System.out.println(Oracle);
		
		context.close();
		
		
	}
	
}

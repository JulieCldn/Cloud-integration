package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("serviceActivator.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("routing.xml");
	}

}
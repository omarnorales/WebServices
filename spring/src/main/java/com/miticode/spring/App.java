package com.miticode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Mundo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		
		//Patron factoria de Spring Container
		Mundo m = (Mundo) appContext.getBean("mundo");
		System.out.println(m.getSaludo());
		
		//si se desea libera el recurso
		((ConfigurableApplicationContext)appContext).close();
		
		/*
		 * otra Opcion para inbocarlo
		 * Mundo m = appContext.getBean(Mundo.class);
		 */
		
		
		
	}

}

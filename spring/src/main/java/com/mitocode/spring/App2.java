package com.mitocode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Mundo;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Forma 1: Configuracion o enfoque por XML
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		
		//Forma2: Configoracion por Notaciones forma 1
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		
		//Forma3: Configoracion por Notaciones forma 2
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
		appContext.register(AppConfig.class);
		appContext.register(AppConfig2.class);
		appContext.refresh();
		
		//Llamada a bean mundo
		//Patron factoria de Spring Container
		//Mundo m = (Mundo) appContext.getBean("mundo");
		
		//Llamada a beab marte
		Mundo m = (Mundo) appContext.getBean("marte");
		
		//Forma3
		
		
		System.out.println(m.getSaludo());
		
		//si se desea libera el recurso
		((ConfigurableApplicationContext)appContext).close();
		
		/*
		 * otra Opcion para inbocarlo
		 * Mundo m = appContext.getBean(Mundo.class);
		 */
		
		
		
	}

}

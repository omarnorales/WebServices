package com.mitocode.spring;

import java.util.Iterator;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.AppConfig;
import com.mitocode.beans.AppConfig2;
import com.mitocode.beans.Barcelona;
import com.mitocode.beans.Ciudad;
import com.mitocode.beans.Jugador;
import com.mitocode.beans.Juventus;
import com.mitocode.beans.Mundo;
import com.mitocode.beans.Persona;

public class App3 {

	public static void main(String[] args) {

		//Forma 1: Configuracion o enfoque mixto XML y notaciones
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1- Barcelona 2-Juventus");
		int respuesta = sc.nextInt();
		
		switch (respuesta) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;
			
		case 2:
			jug.setEquipo(new Juventus());
			break;

		default:
			break;
		}
		
		

		System.out.println(jug.getNombre() +"-"+ jug.getEquipo().mostrar() +"-"+ jug.getCamiseta().getNumero() +"-"+ jug.getCamiseta().getMarca().getNombre());
		
		((ConfigurableApplicationContext)appContext).close();
		
		
		
		/*for (Ciudad ciu : per.getPais().getCiudades()) {
			nombresCiudades +=ciu.getNombre() + "-";
		}*/
		
	}

}

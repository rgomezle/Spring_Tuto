package com.roloapps.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.roloapps.beans.Jugador;

public class App {

	public static void main(String[] args) {
				
		ApplicationContext AppContext = 
				new ClassPathXmlApplicationContext("com/roloapps/xml/beans.xml");
		
		Jugador jug = (Jugador) AppContext.getBean("messi");	

		System.out.println(jug.getNombre()+" - "+jug.getEquipo().mostrar());
			
		((ConfigurableApplicationContext)AppContext).close();
	}

}

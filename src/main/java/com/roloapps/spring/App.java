package com.roloapps.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roloapps.beans.Ciudad;
import com.roloapps.beans.Jugador;
import com.roloapps.beans.Persona;
import com.roloapps.interfaces.Equipo;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext AppContext = 
				new ClassPathXmlApplicationContext("com/roloapps/xml/beans.xml");
		
		//Jugador jug = (Jugador) AppContext.getBean("messi");	
		//implementando la interfaz equipo, le da mas felxibilidad 
		Equipo eq = (Equipo) AppContext.getBean("juventus");
		Equipo eq2 = (Equipo) AppContext.getBean("barcelona");
		//La interfaz para ambos equipos
		System.out.println("Equipos: \n"+eq.mostrar()+"\n"+eq2.mostrar());
			
		((ConfigurableApplicationContext)AppContext).close();
	}

}

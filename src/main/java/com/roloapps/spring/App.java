package com.roloapps.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roloapps.beans.Barcelona;
import com.roloapps.beans.Jugador;
import com.roloapps.beans.Juventus;

public class App {

	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija un equipo: 1-Barcelona 2-Juventus");
		int respuesta = sc.nextInt();
		
		ApplicationContext AppContext = 
				new ClassPathXmlApplicationContext("com/roloapps/xml/beans.xml");
		Jugador jug = (Jugador) AppContext.getBean("jugador");	
	
		switch (respuesta) {
		case 1:
			jug.setEquipo(new Barcelona());
			break;

		case 2:
			jug.setEquipo(new Juventus());
			break;
	
		}
		

		System.out.println("Nombre: "+jug.getNombre()+"\nEquipo: "+jug.getEquipo().mostrar()+
				"\nCamiseta: "+jug.getCamiseta().getMarca().getNombre()+
				"\nNumero :"+jug.getCamiseta().getNumero());
			
		((ConfigurableApplicationContext)AppContext).close();
	}

}

package com.roloapps.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.roloapps.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext AppContext = new ClassPathXmlApplicationContext("com/roloapps/xml/beans.xml");
		Persona per = (Persona) AppContext.getBean("persona");	
		
		per.setId(1);
		per.setNombre("Rolo");
		
	    System.out.println(per.getId()+" "+per.getNombre()+" "+per.getApodo()+" "+per.getPais().getNombre()+" "+per.getCiudad().getNombre()    );
	    		
		((ConfigurableApplicationContext)AppContext).close();
				
	
	}

}

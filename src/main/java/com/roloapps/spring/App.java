package com.roloapps.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roloapps.beans.AppConfig;
import com.roloapps.beans.Mundo;

public class App {

	public static void main(String[] args) {

		//ApplicationContext AppContext = new ClassPathXmlApplicationContext("com/roloapps/xml/beans.xml");
		ApplicationContext AppContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//En vez del XML este carga Value definido en Mundo.java - AnnotationCon....
		Mundo m = (Mundo) AppContext.getBean("mundi"); //bean id
		
		//mundo m = AppContext.getBean(mundo.class);
		
		System.out.print(m.getFirst()+"\n");
		
		((ConfigurableApplicationContext)AppContext).close();
		
		}

}

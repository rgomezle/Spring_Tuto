package com.roloapps.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.roloapps.beans.Mundo;

public class App {

	public static void main(String[] args) {

		ApplicationContext AppContext = new ClassPathXmlApplicationContext("com/roloapps/xml/beans.xml");
		Mundo m = (Mundo) AppContext.getBean("mundi"); //bean id
		//mundo m = AppContext.getBean(mundo.class);
		System.out.print(m.getFirst()+"\n");
		((ConfigurableApplicationContext)AppContext).close();
		
		}

}

package com.roloapps.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class roloappsBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Destruido Bean: " + nombreBean);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Inicio Bean:" + nombreBean);
		return bean;
	}

}

package com.roloapps.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pais {

	private String nombre;

	@PostConstruct
	public void initBean(){
		System.out.println("Creado bean");
		}
	
	@PreDestroy
	public void destroyBean(){
		System.out.println("Destruido Bean");
		}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}

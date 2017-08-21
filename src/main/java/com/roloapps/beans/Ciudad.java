package com.roloapps.beans;

public class Ciudad {

	private String nombre;
	
	public void initBean(){
		System.out.println("Inicio Bean");
		}
	
	public void destroyBean(){
		System.out.println("Fin de Bean");
		}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

package com.roloapps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Required;

import com.roloapps.interfaces.Equipo;

public class Jugador {

	private int numero;
	private String nombre;
	@Autowired
	@Qualifier("juventusQ")
	private Equipo equipo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	//@Required
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	
	
	
}

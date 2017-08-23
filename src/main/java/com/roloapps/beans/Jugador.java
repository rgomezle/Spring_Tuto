package com.roloapps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.roloapps.interfaces.Equipo;

@Component("messi")
public class Jugador {

	private int numero;
	@Value("Lionel Messi")
	private String nombre;
	@Autowired //tiene byType por defecto
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

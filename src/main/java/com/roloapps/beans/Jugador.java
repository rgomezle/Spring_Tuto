package com.roloapps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.roloapps.interfaces.Equipo;

public class Jugador {

private int id;
@Value("Rolo")
private String nombre;
@Autowired
@Qualifier("barcelona")
private Equipo equipo;
@Autowired
private Camiseta camiseta;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public void setEquipo(Equipo equipo) {
	this.equipo = equipo;
}
public Camiseta getCamiseta() {
	return camiseta;
}
public void setCamiseta(Camiseta camiseta) {
	this.camiseta = camiseta;
}

}

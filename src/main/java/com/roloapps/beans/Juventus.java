package com.roloapps.beans;

import org.springframework.stereotype.Component;

import com.roloapps.interfaces.Equipo;

@Component
public class Juventus implements Equipo{

	public String mostrar() {
		return "Juventus";
	}
}

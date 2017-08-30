package com.roloapps.spring;

import org.springframework.context.annotation.Bean;

import com.roloapps.beans.*;

public class AppConfig {

	@Bean
	public Jugador jugador(){
		return new Jugador();		
	}
	
	@Bean
	public Barcelona barcelona(){
		return new Barcelona();		
	}
	
	@Bean
	public Camiseta camiseta(){
		return new Camiseta();		
	}
	
	@Bean
	public Marca marca(){
		return new Marca();		
	}
}

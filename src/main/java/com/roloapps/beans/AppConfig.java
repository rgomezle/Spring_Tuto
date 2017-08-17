package com.roloapps.beans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Mundo mundi(){
		return new Mundo(); //Similar a beans.xml
	}
	
}

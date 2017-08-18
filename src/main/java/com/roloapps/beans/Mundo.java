package com.roloapps.beans;
import org.springframework.beans.factory.annotation.Value;

public class Mundo {

@Value("Testing_One")	
private String First;

public String getFirst() {
	return First;
}

public void setFirst(String first) {
	First = first;
}

}
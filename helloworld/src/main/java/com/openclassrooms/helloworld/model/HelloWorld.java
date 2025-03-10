package com.openclassrooms.helloworld.model;

public class HelloWorld {
	// Classe modelle, donné à manipuler
	
	private String value = "Hello World!";//attribut
	
	public String getValue() {//getter
		return value;
	}

	public void setValue(String value) {//setter
		this.value = value;
	}
	
	@Override //methode qui surcharge la methode toString de la class object qui retourne l'attribut value
	public String toString() {
		return value;
	}
}

package com.openclassrooms.helloworld.service;

import org.springframework.stereotype.Component;

import com.openclassrooms.helloworld.model.HelloWorld;
//objet métier

@Component // declare la classe comme un bean pour spring, pour l'injecter à l'intérieur d'un autre bean
public class BusinessService {

	//la methode instancie un object HelloWorld et le return
	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}
}

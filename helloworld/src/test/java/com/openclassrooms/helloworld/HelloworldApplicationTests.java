package com.openclassrooms.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.openclassrooms.helloworld.service.BusinessService;

@SpringBootTest // initiailise le contexte Spring 
class HelloworldApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private BusinessService bs; // injecte une instance de businessService dans un attribut nommé bs
	
	@Test
	public void testGetHelloWorld() {
		String expected = "Hello World";// definit le resultat attendu
		String result = bs.getHelloWorld().getValue();
		// recupère l'objet HelloWorld à traver l'instance bs et appel la méthode getValue
		assertEquals(expected, result);
	}

}

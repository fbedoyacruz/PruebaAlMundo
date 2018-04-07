package com.co.almundo.prueba.callcenter.PruebaAlMundo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaAlMundoApplicationTests {

	
	public static void main(String[] args) {
		SpringApplication.run(PruebaAlMundoApplicationTests.class, args);
		 
	}	
	  
	@Test
	public void contextLoads() {
		System.out.println("Prueba al mundo proyecto esqueleto Spring");
	}

}

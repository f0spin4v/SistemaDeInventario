package com.example.Sistema.de.inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//funcion principal
@SpringBootApplication (exclude={SecurityAutoConfiguration.class})
@RestController
public class SistemaDeInventarioApplication {

	@GetMapping("/hello")
	public String hello(){
		return"Hola mundo saldremos dios quiera de esto";
	}

	public static void main(String[] args) {

		SpringApplication.run(SistemaDeInventarioApplication.class, args);
		System.out.println("Hola Mundo");
	}

}

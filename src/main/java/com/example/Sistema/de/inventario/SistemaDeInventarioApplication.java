package com.example.Sistema.de.inventario;

import com.example.Sistema.de.inventario.modelo.Empresa;
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

	@GetMapping("/test")
	public String test(){
		Empresa donPepe = new Empresa("Variedades Don Pepe","1098","Universidad del Quindio","300");
		donPepe.setNombre("Salchicon");
		return donPepe.getNombre();
	}

	public static void main(String[] args) {

		SpringApplication.run(SistemaDeInventarioApplication.class, args);
		System.out.println("Hola Mundo");
	}

}

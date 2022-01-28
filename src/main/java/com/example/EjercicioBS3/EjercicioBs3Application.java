package com.example.EjercicioBS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EjercicioBs3Application {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioBs3Application.class, args);
	}
	@PostConstruct
	public void ejecutame1(){
		System.out.println("Hola desde la clase inicial");
	}

	@Bean
	CommandLineRunner ejecutame2(){
		return p ->{
			System.out.println("Hola desde clase secundaria");
		};
	}

	@Bean
	CommandLineRunner ejecutame3(){
		return p ->{
			System.out.println("Soy la tercera clase");
		};
	}
}

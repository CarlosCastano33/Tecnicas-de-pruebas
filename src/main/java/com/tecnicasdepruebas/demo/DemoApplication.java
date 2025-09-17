package com.tecnicasdepruebas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
static Calculadora calculadora = new Calculadora();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(calculadora.operar());
	}

}

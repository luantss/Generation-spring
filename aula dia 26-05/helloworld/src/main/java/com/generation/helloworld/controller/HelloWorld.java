package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") 
public class HelloWorld {

	@GetMapping
	public String hello() {
		return "Orientação ao Futuro; Responsabilidade Pesssoal; Mentalidade de Crescimento; Persistência; Trabalho em Equipe; "
				+ "Atenção aos Detalhes; Proatividade, Comunicação";
	}
}

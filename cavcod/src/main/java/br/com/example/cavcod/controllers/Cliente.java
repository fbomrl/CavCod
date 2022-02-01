package br.com.example.cavcod.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class Cliente {
	@GetMapping("/teste")
	
	public String cliente() {
		
	
	return "TEste";
	}
}

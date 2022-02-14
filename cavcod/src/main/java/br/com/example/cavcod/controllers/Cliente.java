package br.com.example.cavcod.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.cavcod.dao.ContaDao;
import br.com.example.cavcod.models.ContaMod;

@RestController
public class Cliente {

	@Autowired
	private ContaDao dao;

	@GetMapping("/")

	public ArrayList<ContaMod> recuperarTudo() {
		ArrayList<ContaMod> lista;
		lista = (ArrayList<ContaMod>) dao.findAll();
		return lista;
	}

	@GetMapping("/contas/{numero}")
	public ContaMod recuperarConta(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}
}

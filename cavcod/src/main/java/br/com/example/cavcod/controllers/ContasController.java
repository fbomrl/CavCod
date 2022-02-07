package br.com.example.cavcod.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.cavcod.dao.ContaDao;
import br.com.example.cavcod.models.Conta;

//import para indicar que tratasse do controlador principal
@RestController
//Classe inicial da aplicação 
public class ContasController {
	// habilita a importação do banco de dados
	@Autowired
	private ContaDao contaDao; // objeto que interage com o banco de dados

	// Definindo uma rota coringa
	@GetMapping("/contas_clientes")
	// Recebendo o parametro da rota coringa
	// Path usado para busca unica

	public ArrayList<Conta> listaClientes() {
		// Mostrando na tela o valor da rota coringa
		var listaContas = contaDao.findAll();
		return (ArrayList<Conta>) listaContas;
	}

	// teste
	@GetMapping("/clientes_id/{id_titular}")
	public Conta DetalheClinte(@PathVariable int id_titular) {
		// Mostrando na tela o valor da rota coringa
		// return "O resultado do parametro é "+id;
		return contaDao.findById(id_titular).orElse(null);
	}

}
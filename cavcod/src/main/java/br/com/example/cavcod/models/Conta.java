package br.com.example.cavcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbconta")

public class Conta {

	@Id
	@GeneratedValue

	@Column(name = "id")
	private int id;

	@Column(nullable = false, name = "numero", length = 5)
	private int numero;

	@Column(nullable = false, name = "agencia", length = 4)
	private int agencia;

	@Column(nullable = false, name = "tipo_conta", length = 1)
	private int tipo_conta;

	@Column(nullable = false, name = "saldo")
	private double saldo;


	@ManyToOne
	@JoinColumn(name = "id_titular")
	private Cliente titular;
}

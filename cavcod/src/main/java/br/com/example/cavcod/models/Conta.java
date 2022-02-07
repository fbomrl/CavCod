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

	@Column(name = "numero")
	private int numero;

	@Column(name = "agencia")
	private int agencia;

	@Column(name = "tipo_conta")
	private int tipo_conta;

	@Column(name = "saldo")
	private double saldo;

	@ManyToOne
	@JoinColumn(name = "id_titular")
	private Cliente id;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo_conta() {
		return tipo_conta;
	}

	public void setTipo_conta(int tipo_conta) {
		this.tipo_conta = tipo_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getId() {
		return id;
	}

	public void setId(Cliente id) {
		this.id = id;
	}

}

package br.com.example.cavcod.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbcliente")

public class ClienteMod {

	@Id
	@GeneratedValue

	@Column(name = "id")
	private int id;

	@Column(nullable = false, name = "nome_cliente", length = 100)
	private String nome;

	@Column(nullable = false, name = "cpf", length = 15)
	private String cpf;

	@Column(nullable = false, name = "telefone", length = 20)
	private String telefone;

	@Column(nullable = false, name = "email", length = 100)
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

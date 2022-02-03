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



public class ContaMod {



@Id
@GeneratedValue



@Column(name = "id_titular")
private int id_titular;



@Column(nullable = false, name = "numero", length = 5)
private int numero;



@Column(nullable = false, name = "agencia", length = 4)
private int agencia;



@Column(nullable = false, name = "tipo_conta", length = 1)
private int tipo_conta;



@Column(nullable = false, name = "saldo")
private double saldo;



@Column(nullable = false, name = "titular")
private String titular;




@ManyToOne
@JoinColumn(name = "id_titular")
private ClienteMod id;
}

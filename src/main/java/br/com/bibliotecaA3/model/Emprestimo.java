package br.com.bibliotecaA3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="data_ini")
	private String data_ini;
	
	@Column(name = "data_fim")
	private String data_fim;
	
	@ManyToOne
	@JoinColumn
	private Livro fk_livro;
	
	@ManyToOne
	@JoinColumn
	private Usuario fk_usuario;
	
	
	
}

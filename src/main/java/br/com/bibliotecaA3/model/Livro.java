package br.com.bibliotecaA3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer isbn;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "data_lanc")
	private String data_lanc;
	
	@ManyToOne
	@JoinColumn()
	private Editora cod_editora;
	
	@ManyToOne
	@JoinColumn()
	private Genero cod_gen;
	
	@ManyToOne
	@JoinColumn()
	private Autor cod_autor;
	
	public void exemplarDisponivel() {
		
	}

}

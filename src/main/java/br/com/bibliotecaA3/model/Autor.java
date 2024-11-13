package br.com.bibliotecaA3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="nasc_autor")
	private String nasc_autor;
	
	@Column(name="nascionalidade")
	private String nacionalidade;
	
	@Column(name="contato_autor")
	private String contato_autor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNasc_autor() {
		return nasc_autor;
	}

	public void setNasc_autor(String nasc_autor) {
		this.nasc_autor = nasc_autor;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getContato_autor() {
		return contato_autor;
	}

	public void setContato_autor(String contato_autor) {
		this.contato_autor = contato_autor;
	}
	
	
	
}

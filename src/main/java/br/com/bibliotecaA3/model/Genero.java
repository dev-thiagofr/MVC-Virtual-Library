package br.com.bibliotecaA3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="gen_nome")
	private String gen_nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGen_nome() {
		return gen_nome;
	}

	public void setGen_nome(String gen_nome) {
		this.gen_nome = gen_nome;
	}



	
	
}

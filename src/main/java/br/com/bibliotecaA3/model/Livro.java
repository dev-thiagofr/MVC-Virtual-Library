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
	
	@Column(name = "qtd_disp")
	private int qtd_disp;
	
	@Column(name = "image_dir")
	private String image_dir;
	
	@Column(name = "descr")
	private String descr;
	
	@ManyToOne
	@JoinColumn()
	private Editora cod_editora;
	
	@ManyToOne
	@JoinColumn()
	private Genero cod_gen;
	
	@ManyToOne
	@JoinColumn()
	private Autor cod_autor;
	
	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getData_lanc() {
		return data_lanc;
	}

	public void setData_lanc(String data_lanc) {
		this.data_lanc = data_lanc;
	}

	public int getQtd_disp() {
		return qtd_disp;
	}

	public void setQtd_disp(int qtd_disp) {
		this.qtd_disp = qtd_disp;
	}

	public String getImage_dir() {
		return image_dir;
	}

	public void setImage_dir(String image_dir) {
		this.image_dir = image_dir;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Editora getCod_editora() {
		return cod_editora;
	}

	public void setCod_editora(Editora cod_editora) {
		this.cod_editora = cod_editora;
	}

	public Genero getCod_gen() {
		return cod_gen;
	}

	public void setCod_gen(Genero cod_gen) {
		this.cod_gen = cod_gen;
	}

	public Autor getCod_autor() {
		return cod_autor;
	}

	public void setCod_autor(Autor cod_autor) {
		this.cod_autor = cod_autor;
	}

	public void exemplarDisponivel() {
		
	}
	
	public void buscaLivros() {
		
	}
	
	public void buscaLivrosTitulo() {
		
	}

}

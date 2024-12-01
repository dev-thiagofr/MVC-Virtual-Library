package br.com.bibliotecaA3.service;

import br.com.bibliotecaA3.model.Livro;

public class LivroNode {
	
	private Livro livro;
	private LivroNode left;
	private LivroNode right;
	
	public LivroNode(Livro livro) {
		this.livro = livro;
		this.left = null;
		this.right = null;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LivroNode getLeft() {
		return left;
	}

	public void setLeft(LivroNode left) {
		this.left = left;
	}

	public LivroNode getRight() {
		return right;
	}

	public void setRight(LivroNode right) {
		this.right = right;
	}
	
    public int compareTo(String title) {
        return this.livro.getTitulo().compareTo(title);
    }
	
	
	
	
}

package br.com.bibliotecaA3.model;

public class Lista {
	
	private NodeUsuario first, last;
	private int size;
	
	public boolean estaVazio() {
		return first == null;
	}
	
	public void addPrimeiro(Usuario usuario) {
		NodeUsuario novoUsuario = new NodeUsuario(usuario);
		
		if(estaVazio()) {
		first = novoUsuario;
		last = novoUsuario;
		} else {
		last.setNext(novoUsuario);
		last = novoUsuario;
		}
	}
	
	public void addUsuario(Usuario usuario) {
	NodeUsuario novoUsuario = new NodeUsuario(usuario);
	
		if(estaVazio()) {
			first = novoUsuario;
			last = novoUsuario;
		}
	}
	
	 public void remover(int id) {
	        NodeUsuario atual = first;
	        NodeUsuario anterior = null;

	        while (atual != null && !atual.getUsuario().getId().equals(id)) {
	            anterior = atual;
	            atual = atual.getNext();
	        }

	        if (atual != null) {
	            if (estaVazio()) { 
	                first = atual.getNext();
	            } else {
	                anterior.setNext(atual.getNext());
	            }
	            size--;
	        }
	    }


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

}

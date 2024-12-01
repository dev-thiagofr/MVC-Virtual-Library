package br.com.bibliotecaA3.model;

public class NodeUsuario {
	
	private Usuario usuario;
	private NodeUsuario next;
	
	public NodeUsuario(Usuario usuario) {		
		this.usuario = usuario;
		this.next = null;
	}
	
	public NodeUsuario(Usuario usuario, NodeUsuario next) {		
		this.usuario = usuario;
		this.next = next;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public NodeUsuario getNext() {
		return next;
	}

	public void setNext(NodeUsuario next) {
		this.next = next;
	}
	
	
	
	

}

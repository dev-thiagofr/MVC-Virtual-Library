package br.com.bibliotecaA3.service;

import org.springframework.stereotype.Service;

import br.com.bibliotecaA3.model.Lista;
import br.com.bibliotecaA3.model.Usuario;

@Service
public class UsuarioService {

	private Lista listaEncadeada;

	public UsuarioService() {
		listaEncadeada = new Lista();
	}
	
    public void adicionarUsuario(Usuario usuario) {
        listaEncadeada.addUsuario(usuario);
    }
    
    public void remover(int id) {
        listaEncadeada.remover(id);
    }
    
    
	
}

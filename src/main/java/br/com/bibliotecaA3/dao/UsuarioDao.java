package br.com.bibliotecaA3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.bibliotecaA3.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

	
	@Query(value="select * from usuario where email= :email and senha= :senha", nativeQuery=true)
	public Usuario loginVerifica(String email, String senha);
}

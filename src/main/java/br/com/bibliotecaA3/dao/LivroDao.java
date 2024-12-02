package br.com.bibliotecaA3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.bibliotecaA3.model.Livro;

public interface LivroDao extends JpaRepository<Livro, Integer>{

	@Query(value="select * from livro", nativeQuery=true)
	public List<Livro> buscaLivros();
	
	 @Query(value="select * from livro where titulo like '%:titulo%'", nativeQuery=true)
	    public List<Livro> buscaLivrosTitulo(@Param("titulo") String titulo);

}

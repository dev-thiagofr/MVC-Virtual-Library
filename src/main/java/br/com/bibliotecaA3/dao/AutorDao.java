package br.com.bibliotecaA3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecaA3.model.Autor;

public interface AutorDao extends JpaRepository<Autor, Integer> {

}
